package homework12;

import java.util.*;

public class FileNavigator {

    Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

    public void add(String url, FileData fileData) {
        if (!fileStorage.containsKey(url)) {
            fileStorage.put(url, new ArrayList<>());
        }
        fileStorage.get(url).add(fileData);
    }

    public ArrayList<FileData> find(String url) {
        if (fileStorage.containsKey(url)) {
            ArrayList<FileData> values = new ArrayList<>(fileStorage.get(url));
            return values;
        } else {
            System.out.println("There are no files...");
        }
        return null;
    }

    public ArrayList<FileData> filterBySize(int size) {
        ArrayList<FileData> valueList = new ArrayList<>();

        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                valueList.add(entry.get(i));
            }
        }

        System.out.println("valueList is:\n" + valueList);
        System.out.println("size = " + size);
        System.out.println("valueList after filter is:");

        for (int i = 0; i < valueList.size(); i++) {
            if (valueList.get(i).getSize() > size) {
                valueList.remove(i);
                i--;
            }
        }

        if (valueList.size() == 0) {
            System.out.println("There are no files...");
        }
        return valueList;
    }

//    private void filterBySizeTest() {
//        ArrayList valueList = new ArrayList<>();
//        for (Map.Entry entry : fileStorage.entrySet()) {
//            System.out.println(entry);
//            System.out.println(entry.getKey() + " | " + entry.getValue());
//            valueList.add(entry.getValue());
//        }
//        System.out.println("------------------------------");
//        ArrayList<FileData> fileData = new ArrayList<>(valueList);
//        for (int i = 0; i < fileData.size(); i++) {
//            System.out.println(fileData.get(i).getPath());
//        }
//    }

    public void remove(String path) {
        ArrayList<FileData> valueList = new ArrayList<>();
        ArrayList<FileData> valueListToDel = new ArrayList<>();

        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (!entry.get(i).getPath().equals(path)) {
                    valueList.add(entry.get(i));
                } else {
                    valueListToDel.add(entry.get(i));
                }
            }
        }

        System.out.println("New valueList without <<" + path + ">> is: \n" + valueList);
        System.out.println("New valueList with <<" + path + ">> is: \n" + valueListToDel);

        for (Map.Entry entry : fileStorage.entrySet()) {
            System.out.println("key + value:");
            System.out.println(entry.getKey() + " + " + entry.getValue());
        }
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileStorage=" + fileStorage +
                '}';
    }
}
