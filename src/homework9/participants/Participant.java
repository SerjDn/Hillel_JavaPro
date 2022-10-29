package homework9.participants;

public abstract class Participant {

    void run() {
        System.out.println("I can run.");
    }

    void jump() {
        System.out.println("I can jump.");
    }

    abstract int getMaxLength();

    abstract int getMaxHeight();

    abstract String getName();

    boolean canDoIt = true;

}
