package homework12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FileNavigator {

    Map<String, ArrayList<FileData>> fileStorage = new HashMap<>();

    public void add(String url, FileData fileData) {
        if (!fileStorage.containsKey(url)) {
            fileStorage.put(url, new ArrayList<FileData>());
            fileStorage.get(url).add(fileData);
        } else {
            fileStorage.get(url).add(fileData);
        }
        System.out.println(fileStorage.get(url));
    }

    public void find(String url) {
        if (fileStorage.containsKey(url)) {
            ArrayList<FileData> values = new ArrayList<>(fileStorage.get(url));
            System.out.println(fileStorage.get(url));
            System.out.println(values);

            System.out.println();
        } else {
            System.out.println("нету");
        }
    }

    public void filterBySize(int size) {

    }

    @Override
    public String toString() {
        return "FileNavigator{" +
                "fileStorage=" + fileStorage +
                '}';
    }
}
