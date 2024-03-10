package m04_unary_shorthand_operators;

/*
    Declare and initialize variable players as 5.
    write a statement(s) that increases the value of that variable by 4.
    With and without shorthand/unary operators
 */

public class AddPlayers {
    public static void main(String[] args) {
        int players = 5;
        players = players + 4;
        players += 4;
        int morePlayers = 4;
        players += morePlayers;
        players++;players++;players++;players++;

        System.out.println("players = " + players);

    }
}
