import java.util.Scanner;
    
    /*
      CHC-14FEB2019
        Doing the Do(-while)'s
        Gave user the ability to add more than one set of test scores. User
            states how many test scores will be entered.
        Added minimum and maximum test scores to be displayed on output.
        
    */

public class TestScoreApp
{
    public static void main(String[] args)
    {
        // display operational messages
        System.out.println("Please enter test scores that range from 0 to 100.");
        System.out.println("To end the program enter 999.");
        
        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        int maxTestScore = 0;
        int minTestScore = 100;
        int numOfScores = 0;
        Scanner sc = new Scanner(System.in);
        String moreTests = "y";
        while (!moreTests.equalsIgnoreCase("n"))
            
        
        //System.out.println();  // print a blank line
        

        // get a series of test scores from the user
        do 
        {
        // ask user how many scores will be entered
        System.out.println("How many scores test scores will be entered?: ");
        numOfScores = sc.nextInt();
        if (numOfScores > 0 && numOfScores != 999)
        {
            scoreCount = 0;
            scoreTotal = 0;
            while (numOfScores > 0)
            
            
        // get the input from the user
        System.out.print("Enter score: ");
        testScore = sc.nextInt();

        // accumulate score count and score total
        if (testScore <= 100)
            {
                scoreCount = scoreCount + 1;
                scoreTotal = scoreTotal + testScore;
                numOfScores --;
                
                //Get min and max test scores
                maxTestScore = Math.max(maxTestScore, testScore);
                minTestScore = Math.min(minTestScore, testScore);
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
                System.out.println("Averaging scores.");
            }
        }
        
        while (testScore != 999);
                
        // display the score count, score total, and average score
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n"
                       + "Min Test Score: " + minTestScore + "\n"
                       + "Max Test Score: " + maxTestScore + "\n";
        System.out.println(message);
        System.out.println("Enter more test scores? ('y' or 'n'):  ");
        moreTests = sc.next();
        System.out.println();
        }
     // incomplete. Getting closer.... and pissed   
    }
}
