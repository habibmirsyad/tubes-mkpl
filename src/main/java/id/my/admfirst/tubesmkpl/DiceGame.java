package id.my.admfirst.tubesmkpl;

import java.util.Random;

public class DiceGame {
    private static Random random = new Random();

    private int targetScore;
    private int totalScore;
    private boolean gameOver;

    public DiceGame(int targetScore) {
        this.targetScore = targetScore;
        this.totalScore = 0;
        this.gameOver = false;
    }

    public void rollDice() {
        int diceRoll = random.nextInt(6) + 1;
        System.out.println("You rolled a " + diceRoll);

        totalScore += diceRoll;

        if (totalScore >= targetScore) {
            System.out.println("Congratulations! You reached the target score of " + targetScore);
            gameOver = true;
        } else {
            System.out.println("Your current score is: " + totalScore);
        }
    }

    public boolean isGameOver() {
        return targetScore;
    }

    public void setGameOver(boolean gameOver){
        this.gameOver = gameOver;
    }
}
