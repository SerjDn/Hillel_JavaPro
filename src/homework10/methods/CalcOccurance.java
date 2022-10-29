package homework10.methods;

import java.util.*;

public class CalcOccurance {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("car");
        words.add("bus");
        words.add("tram");
        words.add("car");
        words.add("train");
        words.add("plane");
        words.add("bus");
        words.add("train");
        words.add("bike");
        words.add("car");

        calcOccurance(words);
    }

    private static void calcOccurance(ArrayList<String> words) {
        HashMap<String, Integer> countWords = new HashMap<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);
            Integer counter = countWords.get(word);
            if (countWords.containsKey(word)) {
                countWords.put(word, counter + 1);
            } else {
                countWords.put(word, 1);
            }
        }

        System.out.println("============================");
        System.out.println(countWords.get("car"));
        System.out.println("============================");
        System.out.println(countWords);
        System.out.println("============================");

        for (Map.Entry<String, Integer> wordOccurrence : countWords.entrySet()) {
            System.out.println(wordOccurrence.getKey() + ": " + wordOccurrence.getValue());
        }
    }

}
