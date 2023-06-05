package id.my.admfirst.tubesmkpl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DiceGameTest {
    @Test
    public void testRollDice() {
        DiceGame game = new DiceGame(13);

        game.rollDice();
        Assertions.assertFalse(game.isGameOver());

        game.rollDice();
        Assertions.assertFalse(game.isGameOver());
    }

    @Test
    public void testGameWin() {
        DiceGame game = new DiceGame(2);

        game.rollDice();
        game.rollDice();
        Assertions.assertTrue(game.isGameOver());
    }
}
