package homework7_v2;

public class Main {

    public static void main(String[] args) {
        Animal murzik = new Cat();
        murzik.startRun("Murzik", 50);
        murzik.startSwim("Murzik", 50);

        Animal pushok = new Cat();
        pushok.startRun("Pushok", -5);
        pushok.startSwim("Pushok", 5);

        Animal barbos = new Dog();
        barbos.startRun("Barbos", 600);
        barbos.startSwim("Barbos", 30);

        Animal sharik = new Dog();
        sharik.startRun("Sharik", 60);
        sharik.startSwim("Sharik", 10);

        showCountInfo();
    }

    private static void showCountInfo() {
        System.out.println("==================================================");
        System.out.println("Cats: " + Cat.countCats);
        System.out.println("Dogs: " + Dog.countDogs);
        System.out.println("Animals: " + Animal.countAnimals);
    }

}
