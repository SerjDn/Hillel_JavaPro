package homework12;

public class Main {

    public static void main(String[] args) {

        FileData fileData1 = new FileData("First Lesson", 10, "C:/Hillel/Lesson1");
        FileData fileData2 = new FileData("Second Lesson", 20, "C:/Hillel/Lesson2");
        FileData fileData3 = new FileData("Third Lesson", 30, "C:/Hillel/Lesson3");
        FileData fileData4 = new FileData("First Homework", 15, "C:/Practice/Homework1");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/Hillel", fileData1);
        fileNavigator.add("C:/Hillel", fileData2);
        fileNavigator.add("C:/Hillel", fileData3);
        fileNavigator.add("C:/Practice", fileData4);

        System.out.println("================================================");
        System.out.println("Method add working:");
        System.out.println("================================================");
        System.out.println(fileNavigator.fileStorage);
        System.out.println(fileNavigator.fileStorage.get("C:/Hillel"));
        System.out.println(fileNavigator.fileStorage.get("C:/Practice"));

        System.out.println("\n================================================");
        System.out.println("Method find working:");
        System.out.println("================================================");
        System.out.println(fileNavigator.find("C:/Hillel"));

        System.out.println("\n================================================");
        System.out.println("Method filterBySize working:");
        System.out.println("================================================");
        System.out.println(fileNavigator.filterBySize(11));

        System.out.println("\n================================================");
        System.out.println("Method remove working:");
        fileNavigator.remove("C:/Hillel/Lesson2");
        System.out.println("================================================");

    }
}
