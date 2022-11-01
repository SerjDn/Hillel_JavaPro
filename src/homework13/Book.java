package homework13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Book {

    Map<String, Integer> words = new LinkedHashMap<>();

    public void findBook(String name) {
        FileReader fileReader;
        BufferedReader bufferedReader;
        try {
            fileReader = new FileReader("src/homework13/" + name + ".txt");
            bufferedReader = new BufferedReader(fileReader);
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.split("[ ,.()\\[\\]']");
                for (String word : strings) {
                    if (word.length() > 2) {
                        if (!words.containsKey(word)) {
                            words.put(word, 1);
                        } else {
                            words.put(word, words.get(word) + 1);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("There aren't any book with name: " + "<" + name + ">");
        }

        System.out.println(words.entrySet());


        System.out.println("=========================================================================================");
        ArrayList<Words> sortedWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            sortedWords.add(new Words(entry.getKey(), entry.getValue()));
        }
        System.out.println(sortedWords);
        Collections.sort(sortedWords);
        System.out.println("=========================================================================================");
        System.out.println("After sorting:");
        System.out.println("=========================================================================================");
        for (int i = 0, n = 1; i < sortedWords.size() && i < 10; i++, n++) {
            System.out.println(n + ") " + sortedWords.get(i).getName() + ": " + sortedWords.get(i).getCount() + " matches");
        }
    }

}
