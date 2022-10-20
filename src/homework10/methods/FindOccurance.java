package homework10.methods;

import java.util.ArrayList;
import java.util.HashMap;

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

        findOccurance(words);
    }

    private static void findOccurance(ArrayList<String> words) {
        HashMap<String, Integer> countWords = new HashMap<>();
        ArrayList<Occurrence> countWordsList = new ArrayList<>();

        for (String word : words) {
            Integer counter = countWords.get(word);
            Occurrence occurrence = new Occurrence();

            if (countWords.containsKey(word)) {
                countWords.put(word, counter + 1);

                occurrence.setName(word);
                occurrence.setCount(counter + 1);
            } else {
                countWords.put(word, 1);

                occurrence.setName(word);
                occurrence.setCount(1);
            }

            System.out.println("word: " + word);
            System.out.println("countWordsList before: " + countWordsList);

            if (countWordsList.contains(word)) {
                countWordsList.remove(word);
                countWordsList.add(occurrence);
            } else {
                countWordsList.add(occurrence);
            }

            System.out.println("countWordsList after: " + countWordsList);

            System.out.println("\nThis is find method: \n" + find(countWordsList, word));

            System.out.println("----------------------------------------------------------------------------------");

        }

        System.out.println("============================");
        System.out.println(countWords.get("fox"));
        System.out.println("============================");
        System.out.println(countWords);
        System.out.println("============================");
        System.out.println(countWordsList);
        System.out.println("============================");

    }

    private static ArrayList<Occurrence> find(ArrayList<Occurrence> countWordsList, String word) {
        ArrayList<Occurrence> testList = new ArrayList<>();

        for (int i = 0; i < countWordsList.size(); i++) {
            if (countWordsList.get(i).getName().equals(word) && countWordsList.get(i).getCount() > 1) {
                System.out.println("Match! " + word);
            }
        }

        return testList;
    }

}
