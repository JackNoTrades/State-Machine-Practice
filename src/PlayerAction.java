import java.util.Random;
import java.util.Scanner;

public class PlayerAction extends State {

    void enter() {
        System.out.println("Now in the Players Action phase.");
    }

    void update() {
        rand = new Random();
        int randInt = rand.nextInt(max)+min;

        while (true) {
            if (canMove) {
                System.out.println("1. Take Action and go to player Move.");
                System.out.println("2. Take Action and end turn. (AI Move)");
                Scanner s = new Scanner(System.in);
                String input = s.next();

                switch (input) {
                    case "1":
                        System.out.println("Player attacks for " + randInt + " damage.");
                        current = playerMove;
                        playerMove.canAction = false;
                        return;
                    case "2":
                        System.out.println("Player attacks for " + randInt + " damage.");
                        current = aiMove;
                        playerAction.canMove = true;
                        playerMove.canAction = true;
                        return;
                    default:
                        System.out.println("[Error] Please make a selection in the menu.");
                }
            }
            else {
                System.out.println("1. Take Action and end turn. (AI Move)");
                Scanner s = new Scanner(System.in);
                String input = s.next();

                switch (input) {
                    case "1":
                        System.out.println("Player attacks for " + randInt + " damage.");
                        current = aiMove;
                        playerAction.canMove = true;
                        playerMove.canAction = true;
                        return;
                    default:
                        System.out.println("[Error] Please make a selection in the menu.");
                }
            }
        }
    }
}
