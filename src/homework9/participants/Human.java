package homework9.participants;

public class Human extends Participant {

    private int maxLength;
    private int maxHeight;
    private String name;

    public Human(String name, int maxLength, int maxHeight) {
        this.name = name;
        this.maxLength = maxLength;
        this.maxHeight = maxHeight;
    }

    public int getMaxLength() {
        return maxLength;
    }

    public int getMaxHeight() {
        return maxHeight;
    }

    public String getName() {
        return name;
    }

    @Override
    void run() {
        super.run();
    }

    @Override
    void jump() {
        super.jump();
    }
}
