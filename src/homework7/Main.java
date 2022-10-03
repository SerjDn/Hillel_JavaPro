package homework7;

public class Main {

    private static int countCats;
    private static int countDogs;

    public static void main(String[] args) {
        Animal murzik = new Cat();
        countCats++;
        murzik.startRun("Murzik", 50);
        murzik.startSwim("Murzik", 50);

        Animal pushok = new Cat();
        countCats++;
        pushok.startRun("Pushok", -5);
        pushok.startSwim("Pushok", 5);

        Animal barbos = new Dog();
        countDogs++;
        barbos.startRun("Barbos", 600);
        barbos.startSwim("Barbos", 30);

        Animal sharik = new Dog();
        countDogs++;
        sharik.startRun("Sharik", 60);
        sharik.startSwim("Sharik", 10);

        showCountInfo();
    }

    private static void showCountInfo() {
        int countAnimals = countCats + countDogs;
        System.out.println("==================================================");
        System.out.printf("Cats: %d \nDogs: %d \nAnimals: %d", countCats, countDogs, countAnimals);
    }

}
