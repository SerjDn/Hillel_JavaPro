package homework7_v2;

public class Cat extends Animal {

    public static int countCats;

    public Cat() {
        countCats++;
    }

    @Override
    public void startRun(String name, int distance) {
        if (distance >= 0 && distance <= 200) {
            super.startRun(name, distance);
        } else if (distance > 200) {
            System.out.printf("%s: it's too much for me (%d)\n", name, distance);
        } else {
            System.out.printf("%s: I can't do it (%d)\n", name, distance);
        }
    }

    @Override
    public void startSwim(String name, int distance) {
        System.out.printf("%s: I can't swim because cats can't swim\n", name);
    }
}
