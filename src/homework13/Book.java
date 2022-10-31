package homework13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Book {

    public void findBook(String name) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("src/homework13/" + name + ".txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("There aren't any book with name: " + "<" + name + ">");
        }
    }

}
