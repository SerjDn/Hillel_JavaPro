package homework9.participants;

public class Wall extends Obstruction {

    private final String name = "<<WALL>>";
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    void overcome(Participant participant) {
        if (participant.getMaxHeight() >= this.height) {
            System.out.printf("\nParticipant %s passed the obstruction %s at distance %d.",
                    participant.getName(), this.name, this.height);
        } else {
            System.out.printf("\nParticipant %s didn't pass the obstruction %s at distance %d. Passed %d.",
                    participant.getName(), this.name, this.height, participant.getMaxHeight());
            participant.canDoIt = false;
        }
    }
}
