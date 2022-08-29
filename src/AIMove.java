import java.util.Random;
import java.util.Scanner;

public class AIMove extends State {

    void enter() {
        System.out.println("Now in the AIs Move phase.");
    }

    void update() {
        rand = new Random();
        int randInt = rand.nextInt(max)+min;

        while (true) {
            System.out.println("1. AI Move and go to AI Action.");
            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {
                case "1":
                    System.out.println("AI moves " + randInt + " spaces.");
                    current = aiAction;
                    return;
                default:
                    System.out.println("[Error] Please make a selection in the menu.");
            }
        }
    }
}