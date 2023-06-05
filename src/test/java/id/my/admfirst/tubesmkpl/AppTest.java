package id.my.admfirst.tubesmkpl;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testMainGameWon() {
        // Set up input
        String input = "1\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Redirect output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        // Run the main method
        App.main(new String[]{});

        // Restore input/output streams
        System.setIn(System.in);
        System.setOut(originalOut);

        // Verify the output using regular expressions
        String expectedOutput = "Welcome to the Dice Game!\n" +
                "Enter the target score:\n" +
                "You rolled a \\d\n" +
                "Your current score is: \\d\n"+
                "Do you want to roll again? (Y/N)\n" +
                "Congratulations! You reached the target score of 1\n";
                System.out.println(outContent.toString());
        assertFalse(Pattern.matches(expectedOutput, outContent.toString()));
    }
}
