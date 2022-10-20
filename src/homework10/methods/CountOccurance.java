package homework10.methods;

import java.util.ArrayList;

public class CountOccurance {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("one");

        String str = "one";

        System.out.println(countOccurance(words, str));
    }

    private static int countOccurance(ArrayList<String> words, String str) {
        int count = 0;

        for (String word : words) {
            if (word.equals(str)) {
                count++;
            }
        }
        return count;
    }

}
