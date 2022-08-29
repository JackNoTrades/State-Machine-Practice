import java.util.Scanner;

public class AIAction extends State {

    void enter() {
        System.out.println("Now in the AIs Action phase.");
    }

    void update() {
        while (true) {
            System.out.println("1. AI makes Action and end turn. (Player Move)");
            System.out.println("2. AI makes Action and end turn. (Player Action)");
            Scanner s = new Scanner(System.in);
            String input = s.next();

            switch (input) {
                case "1":
                    current = playerMove;
                    return;
                case "2":
                    current = playerAction;
                    return;
                default:
                    System.out.println("[Error] Please make a selection in the menu.");

            }
        }
    }
}