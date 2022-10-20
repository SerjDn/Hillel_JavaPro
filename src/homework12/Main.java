package homework12;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        FileData fileData = new FileData("Homework", 10, "C://Hillel");
        FileData fileData2 = new FileData("Lessons", 15, "C://Hillel");
        FileData fileData3 = new FileData("Practice", 20, "C://Hillel//Practice");

        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add("C://Hillel", fileData3);
        fileNavigator.add("C://Hillel", fileData2);
        fileNavigator.add("C://Hillel//Practice", fileData);

    }

}
