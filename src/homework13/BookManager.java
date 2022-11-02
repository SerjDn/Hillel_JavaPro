package homework13;

import java.io.*;
import java.util.*;

public class BookManager {

    Map<String, Integer> words = new HashMap<>();
    List<Words> sortedWords = new ArrayList<>();
    final int SELECT_TOP_N = 10;

    private String bookName;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public boolean findBook(String name) {
        try (FileReader fileReader = new FileReader("src/homework13/" + name + ".txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            String[] strings;
            while ((line = bufferedReader.readLine()) != null) {
                strings = line.toLowerCase().split("[^a-z0-9\\-]");
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
            return true;
        } catch (IOException e) {
            System.out.println("There aren't any book with name: " + "<" + name + ">");
            return false;
        }
    }

    public void showBookInfo() {
        System.out.println("=========================================================================================");
        System.out.println("Map before sorting:");
        System.out.println(words.entrySet());

        System.out.println("=========================================================================================");
        System.out.println("List before sorting:");
        for (Map.Entry<String, Integer> entry : words.entrySet()) {
            sortedWords.add(new Words(entry.getKey(), entry.getValue()));
        }
        System.out.println(sortedWords);

        System.out.println("=========================================================================================");
        System.out.println("List after sorting:");
        Collections.sort(sortedWords);
        for (int i = 0; i < sortedWords.size() && i < SELECT_TOP_N; i++) {
            System.out.println((i + 1) + ") " + sortedWords.get(i).getName() + ": " + sortedWords.get(i).getCount() + " matches");
        }

        System.out.println("=========================================================================================");
        System.out.println("Count uniq words:");
        System.out.println(sortedWords.size());
        System.out.println("=========================================================================================");
    }

    public void addToFile(String name) {
        File file = new File("src/homework13/" + name + "_statistic.txt");
        try (PrintWriter printWriter = new PrintWriter(file)) {
            for (int i = 0; i < sortedWords.size() && i < SELECT_TOP_N; i++) {
                printWriter.write((i + 1) + ") " + sortedWords.get(i).getName() + ": " + sortedWords.get(i).getCount() + " matches\n");
                printWriter.flush();
            }
            printWriter.write("\nCount uniq words: " + sortedWords.size());
            printWriter.flush();
        } catch (FileNotFoundException e) {
            System.out.println("There are some problem with writing statistics in file...");
        }
    }

}
