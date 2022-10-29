package homework10.methods;

import java.util.*;

public class FindOccurance {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("cat");
        words.add("dog");
        words.add("cat");
        words.add("fox");
        words.add("bear");
        words.add("fox");
        words.add("rabbit");
        words.add("squirrel");
        words.add("fox");
        words.add("dog");

        System.out.println("Result is: \n" + findOccurance(words));
    }

    private static ArrayList<Occurrence> findOccurance(ArrayList<String> words) {
        ArrayList<Occurrence> listOfWords = new ArrayList<>();
        HashSet<String> uniqWords = new HashSet<>();

        for (String word : words) {
            uniqWords.add(word);
        }

        for (String word1 : uniqWords) {
            int count = 0;

            for (String word2 : words) {
                if (word1.equals(word2)) {
                    count++;
                }
            }

            listOfWords.add(new Occurrence(word1, count));
        }
        return listOfWords;
    }

}
