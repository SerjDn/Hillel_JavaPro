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
        words.add("plain");
        words.add("bus");
        words.add("train");
        words.add("bike");
        words.add("car");

        calcOccurance(words);

    }

//    private static void calcOccurance(ArrayList<String> words) {
//        HashSet<String> uniqWords = new HashSet<>(words);
//        System.out.println(uniqWords);
//    }

    private static void calcOccurance(ArrayList<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String thisWord = words.get(i);
            Integer thisWordCount = map.get(thisWord);
            System.out.println("Мне нужно узнать сколько раз встречается слово: " + thisWord + " " +
                    "и записать это в HashMap " + map + "." +
                    " Это запишется вместо: " + map.get(thisWord) + " " + ". " +
                    "Метод containsKey возвращает: " + map.containsKey(thisWord));
            if (map.containsKey(thisWord)) {
                map.put(thisWord, thisWordCount + 1);
            } else {
                map.put(thisWord, 1);
            }
        }

        System.out.println("============================");
        System.out.println(map.get("car"));
        System.out.println("============================");
        System.out.println(map);
        System.out.println("============================");

        for (Map.Entry<String, Integer> wordOccurrence : map.entrySet()) {
            System.out.println(wordOccurrence.getKey() + ": " + wordOccurrence.getValue());
        }

        System.out.println("============================");

        Set<Map.Entry<String, Integer> > entrySet = map.entrySet();

        // Creating an ArrayList of Entry objects
        ArrayList<Map.Entry<String, Integer> > listOfEntry = new ArrayList<>(entrySet);

        System.out.println(listOfEntry);
    }

}
