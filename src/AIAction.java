import java.util.Random;
import java.util.Scanner;

public class AIAction extends State {

    void enter() {
        System.out.println("Now in the AIs Action phase.");
    }

    void update() {
        rand = new Random();
        int randInt = rand.nextInt(max)+min;

        while (true) {
            System.out.println("1. AI takes Action and end turn. (Go to Player Move)");
            System.out.println("2. AI takes Action and end turn. (Go to Player Action)");
            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {
                case "1":
                    System.out.println("AI attacks for " + randInt + " damage.");
                    current = playerMove;
                    return;
                case "2":
                    System.out.println("AI attacks for " + randInt + " damage.");
                    current = playerAction;
                    return;
                default:
                    System.out.println("[Error] Please make a selection in the menu.");

            }
        }
    }
}