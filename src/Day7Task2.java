import human.Player;

import java.util.Random;

import static human.Player.MAX_STAMINA;

public class Day7Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int stamina = MAX_STAMINA - rand.nextInt(11);

        Player player1 = new Player(stamina);
        Player.info();
        Player player2 = new Player(stamina);
        Player player3 = new Player(stamina);
        Player player4 = new Player(stamina);
        Player player5 = new Player(stamina);
        Player player6 = new Player(stamina);
        Player.info();
        for (int i = 0; i < stamina; i++) {
            player1.run();
        }
        Player.info();
    }
}
