package homework12;

import java.util.*;

public class FileNavigator {

    Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

    public void add(String url, FileData fileData) {
        if (!checkBeforeAdd(fileData)) {
            if (!fileStorage.containsKey(url)) {
                fileStorage.put(url, new ArrayList<>());
            }
            fileStorage.get(url).add(fileData);
        }
    }

    private boolean checkBeforeAdd(FileData fileData) {
        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (entry.get(i).getPath().equals(fileData.getPath())) {
                    System.out.println("================================================");
                    System.out.println("Method checkBeforeAdd working:");
                    System.out.println("You cannot add a new file with the same path <<" + fileData.getPath() + ">>");
                    return true;
                }
            }
        }
        return false;
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

    public void remove(String path) {
        System.out.println("--------------------------------------");
        System.out.println("Old fileStorage before removing: \n" + fileStorage.entrySet());
        System.out.println("--------------------------------------");

        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (entry.get(i).getPath().equals(path)) {
                    System.out.println("Удаляем элемент номер: " + i + " из списка: " + entry);
                    entry.remove(i);
                    System.out.println("После удаления элемента номер: " + i + " список стал: " + entry);
                    i--;
                }
            }
        }

        System.out.println("--------------------------------------");
        System.out.println("New fileStorage after removing: \n" + fileStorage.entrySet());
        System.out.println("--------------------------------------");
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileStorage=" + fileStorage +
                '}';
    }
}
