package id.my.admfirst.tubesmkpl;
import java.util.Scanner;

/**
 * Dice Game App!
 * 
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Dice Game!");
        System.out.println("Enter the target score: ");
        int targetScore = scanner.nextInt();

        DiceGame game = new DiceGame(targetScore);

        while (!game.isGameOver()) {
            game.rollDice();

            if (!game.isGameOver()) {
                System.out.println("Do you want to roll again? (Y/N)");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("N")) {
                    System.out.println("Game over. You did not reach the target score.");
                    game.setGameOver(true);
                }
            }
        }

        scanner.close();
    }
}
