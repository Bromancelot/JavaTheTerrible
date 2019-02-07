import java.util.Scanner;
import java.text.NumberFormat;

/* CHC-7Feb2019
        Score counter and score total now use += operator
        Added minimum and maximum testscores to output
        Added average score by using NumberFormat
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
        int maxTestScore = 0;
        int minTestScore = 100;
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
                scoreCount += scoreCount + 1;
                scoreTotal += testScore;
                
                //Get min and max test scores
                maxTestScore = Math.max(maxTestScore, testScore);
                minTestScore = Math.min(minTestScore, testScore);
            }
            
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        //Percentage formatting instance
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        NumberFormat avg = NumberFormat.getNumberInstance();
        avg.setMaximumFractionDigits(1);
        String message = 
                       "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + avg.format(averageScore) + "\n"
                       + "Min Test Score: " + minTestScore + "\n"
                       + "Max Test Score: " + maxTestScore + "\n";
        System.out.println(message);
    }
}
