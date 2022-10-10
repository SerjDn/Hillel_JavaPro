package homework9.participants;

public class Main {

    public static void main(String[] args) {

        Participant human = new Human("Bob", 199, 15);
        Participant cat = new Cat("Kitty",200, 20);
        Participant robot = new Robot("R2D2",500, 1);
        Obstruction treadmill = new Treadmill(300);
        Obstruction wall = new Wall(10);

        Participant[] participants = {human, cat, robot};
        Obstruction[] obstructions = {treadmill, wall};

        for (Participant par : participants) {
            for (Obstruction obs : obstructions) {
                if (par.canDoIt) {
                    obs.overcome(par);
                }
            }
        }
    }
}
