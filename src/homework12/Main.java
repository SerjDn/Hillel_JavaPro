package homework12;

public class Main {

    public static void main(String[] args) {

        FileData fileData = new FileData("Homework", 10, "C:/Hillel/Lesson1");
        FileData fileData2 = new FileData("Lessons", 15, "C:/Hillel/Lesson2");
        FileData fileData3 = new FileData("Practice", 20, "C:/Practice/Homework1");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C:/Hillel", fileData3);
        fileNavigator.add("C:/Hillel", fileData2);
        fileNavigator.add("C:/Practice", fileData);

        System.out.println("================================================\n"
                + fileNavigator + "\n================================================");

        fileNavigator.find("C:/Hillel");

    }

}
