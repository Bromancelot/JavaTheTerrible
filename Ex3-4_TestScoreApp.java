import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* CHC-10Feb2019
        App now uses BigDecimal arithmetic to calculate average.
*/

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
            }
            

        // display the score count, score total, and average score
		  BigDecimal bdScoreTotal = new BigDecimal(scoreTotal);
		  BigDecimal bdScoreCount = new BigDecimal(scoreCount);
		  BigDecimal averageScore = new BigDecimal(0);
		  averageScore = bdScoreTotal.divide(bdScoreCount); 
        averageScore = averageScore.setScale(2, RoundingMode.HALF_UP);
		  String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}
