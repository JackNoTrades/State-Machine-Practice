public class Main {
    public static void main(String[] args) {

        State.playerMove = new PlayerMove();
        State.playerAction = new PlayerAction();
        State.aiMove = new AIMove();
        State.aiAction = new AIAction();
        State.current = State.playerMove;

        while(true) {
            State.current.enter();
            State.current.update();
        }
    }
}