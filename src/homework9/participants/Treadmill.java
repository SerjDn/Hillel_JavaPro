package homework9.participants;

public class Treadmill extends Obstruction {

    private final String name = "<<TREADMILL>>";
    private int length;

    public Treadmill(int length) {
        this.length = length;
    }

    @Override
    void overcome(Participant participant) {
        if (participant.getMaxLength() >= this.length) {
            System.out.printf("\nParticipant %s passed the obstruction %s at distance %d.",
                    participant.getName(), this.name, this.length);
        } else {
            System.out.printf("\nParticipant %s didn't pass the obstruction %s at distance %d. Passed %d.",
                    participant.getName(), this.name, this.length, participant.getMaxLength());
            participant.canDoIt = false;
        }
    }
}
