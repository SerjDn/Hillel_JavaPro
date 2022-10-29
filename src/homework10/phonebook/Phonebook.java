package homework10.phonebook;

import java.util.ArrayList;

public class Phonebook {

    public static void main(String[] args) {

        Entry vasya = new Entry("Vasya", "111-11-11");
        Entry petia = new Entry("Petia", "222-22-22");
        Entry vova = new Entry("Vova", "333-33-33");
        Entry sveta = new Entry("Sveta", "444-44-44");
        Entry sveta2 = new Entry("Sveta", "555-55-55");

        ArrayList<Entry> entries = new ArrayList<>();
        entries.add(vasya);
        entries.add(petia);
        entries.add(vova);
        entries.add(sveta);
        entries.add(sveta2);

        String findByName = "Sveta";

        System.out.println("=================");
        System.out.println(entries);
        System.out.println("=================");
        System.out.println(find(entries, findByName));
        System.out.println("=================");
        System.out.println(findAll(entries, findByName));
        System.out.println("=================");

    }

    private static String find(ArrayList<Entry> entries, String name) {
        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                return entry.getName() + " " + entry.getPhone();
            }
        }
        return null;
    }

    private static ArrayList<Entry> findAll(ArrayList<Entry> entries, String name) {
        ArrayList<Entry> names = new ArrayList<>();

        for (Entry entry : entries) {
            if (entry.getName().equals(name)) {
                names.add(entry);
            }
        }

        if (names.size() > 0) {
            return names;
        } else {
            return null;
        }
    }

}
