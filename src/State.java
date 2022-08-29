import java.util.Random;

public abstract class State {

    static State playerMove, playerAction, aiMove, aiAction, current;

    boolean canMove = true;
    boolean canAction = true;

    Random rand;
    static int min = 1;
    static int max = 12;

    void enter(){}
    void update(){}

}
