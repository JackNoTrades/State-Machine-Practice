import java.util.Random;
import java.util.Scanner;

public class PlayerMove extends State {

    void enter() {
        System.out.println("Now in the Players Move phase.");
    }

    void update() {
        rand = new Random();
        int randInt = rand.nextInt(max)+min;

        while (true) {
            if (canAction) {
                System.out.println("1. Move and go to player Action.");
                System.out.println("2. Move and end turn. (Go to AI Move)");
                Scanner s = new Scanner(System.in);
                String input = s.next();

                switch (input) {
                    case "1":
                        System.out.println("Player moves " + randInt + " spaces.");
                        current = playerAction;
                        playerAction.canMove = false;
                        return;
                    case "2":
                        System.out.println("Player moves " + randInt + " spaces.");
                        current = aiMove;
                        playerAction.canMove = true;
                        playerMove.canAction = true;
                        return;
                    default:
                        System.out.println("[Error] Please make a selection in the menu.");
                }
            }
            else {
                System.out.println("1. Move and end turn. (Go to AI Move)");
                Scanner s = new Scanner(System.in);
                String input = s.next();

                switch (input) {
                    case "1":
                        System.out.println("Player moves " + randInt + " spaces.");
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

