import java.util.Scanner;

/*
    CHC-31Jan2019
        1. Program now displayes "Invalid entry", when inputs any number
           greater than a score of 100.
        2. Program now ends only when user inputs 999. Then displays the
           message: "Ending program and averaging scores."
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
        double scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        Scanner sc = new Scanner(System.in);            
        
        // get a series of test scores from the user       
        while (testScore <= 100)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100 )
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
            }
            
            // does not allow user to enter anything greater than 100
            // or less than 0
            if (testScore > 100 && testScore != 999 )
            {
                System.out.println("Invalid entry, not counted.");
                System.out.println("Please enter a number between 0-100.");
                System.out.println("Enter Score: ");
                testScore = sc.nextInt();
            }
            
            else if (testScore == 999)
            {
                System.out.println("Ending program and averaging scores.");
            }
                       
        }

        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}