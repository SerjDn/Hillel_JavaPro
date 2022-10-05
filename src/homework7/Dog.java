package homework7;

public class Dog extends Animal {

    @Override
    public void startRun(String name, int distance) {
        if (distance >= 0 && distance <= 500) {
            super.startRun(name, distance);
        } else if (distance > 500) {
            System.out.printf("%s: it's too much for me (%d)\n", name, distance);
        } else {
            System.out.printf("%s: I can't do it (%d)\n", name, distance);
        }
    }

    @Override
    public void startSwim(String name, int distance) {
        if (distance >= 0 && distance <= 10) {
            super.startSwim(name, distance);
        } else if (distance > 10) {
            System.out.printf("%s: it's too much for me (%d)\n", name, distance);
        } else {
            System.out.printf("%s: I can't do it (%d)\n", name, distance);
        }
    }
}
