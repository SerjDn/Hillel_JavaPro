package homework7_v2;

public abstract class Animal {

    public static int countAnimals;

    public Animal() {
        countAnimals++;
    }

    public void startRun(String name, int distance) {
        System.out.printf("%s: run distance is %d\n", name, distance);
    }

    public void startSwim(String name, int distance) {
        System.out.printf("%s: swim distance is %d\n", name, distance);
    }

}
