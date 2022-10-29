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

        System.out.println("List is:\n" + fileStorage.values());
        System.out.println("size = " + size);
        System.out.println("List after filter is:");
        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (entry.get(i).getSize() <= size) {
                    valueList.add(entry.get(i));
                }
            }
        }

        if (valueList.size() == 0) {
            System.out.println("There are no files...");
        }
        return valueList;
    }

    public void remove(String path) {
        System.out.println("\nOld fileStorage before removing: \n" + fileStorage.entrySet());

        for (ArrayList<FileData> entry : fileStorage.values()) {
            for (int i = 0; i < entry.size(); i++) {
                if (entry.get(i).getPath().equals(path)) {
                    System.out.println("\nRemoving element number " + i + " from the list: " + entry);
                    entry.remove(i);
                    System.out.println("After removing element number " + i + " the list became: " + entry);
                    i--;
                }
            }
        }

        System.out.println("\nNew fileStorage after removing: \n" + fileStorage.entrySet());
    }

    public void sortBySize() {
        ArrayList<FileData> sortedFiles = new ArrayList<>();

        for (ArrayList<FileData> entry : fileStorage.values()) {
            sortedFiles.addAll(entry);
        }

        System.out.println("\nBefore: ");
        for (FileData entry : sortedFiles) {
            System.out.println(entry);
        }

        System.out.println("\nAfter: ");
        Collections.sort(sortedFiles);
        for (FileData entry : sortedFiles) {
            System.out.println(entry);
        }
    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileStorage=" + fileStorage +
                '}';
    }
}
