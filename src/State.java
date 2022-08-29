public abstract class State {

    static State playerMove, playerAction, aiMove, aiAction, current;

    boolean canMove = true;
    boolean canAction = true;

    void enter(){}
    void update(){}

}
