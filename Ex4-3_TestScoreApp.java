import java.util.Scanner;
import java.text.NumberFormat;
    
    /*
      CHC-14FEB2019
        Doing the Do(-while)'s
        Gave user the ability to add more than one set of test scores. User
            states how many test scores will be entered.
        Added minimum and maximum test scores to be displayed on output.
        Added NumberFormat to display decimals on output.
        
    */

public class TestScoreApp {

    public static void main(String[] args) 
    {
        System.out.println("Please enter the number of test scores to be entered");
        System.out.println("To end the program enter 999.");
        System.out.println();  // print a blank line
 
        // display operational messages    
        int scoreCount = 0,scoreTotal = 0;
        int testScore = 0;
        int min = 100;
        int max = 0;
        int counter = 0;
        int numOfTests = 0;
        String moreTests = "n";
        Scanner sc = new Scanner(System.in);

        // get a series of test scores from the user
        do 
        {
        
            // user enters number of test scores to be entered
            System.out.print("Enter the number of test scores to be entered: ");
            numOfTests = sc.nextInt();
            if (numOfTests > 0 && numOfTests != 999)
            {
                scoreCount=0;
                scoreTotal=0;
                while (numOfTests > 0)
                {
                    // user enters test scores   
                    System.out.print("Enter score: ");
                    testScore = sc.nextInt();
                    if (testScore <= 100)
                    {      
                        scoreCount += 1;
                        scoreTotal += testScore;
                        numOfTests --;
                    } 
                
                    //Added for Exercise 2-2, #4 modified if statement
                    else if (testScore > 100 || testScore < 0) 
                    {
                        System.out.println("Invalid entry, score not counted");
                    } 
                
                    else if (testScore == 999) 
                    {
                        System.out.println("Average test score complete");
                    }
                
                    if (testScore > max && testScore <= 100) 
                    {
                        max = testScore;
                    }
                
                    if (testScore < min && testScore >= 0) 
                    {
                        min = testScore;
                    }
                
            }
            
            // display the score count, score total, and average score
            double averageScore = (double) scoreTotal / (double) scoreCount;
        
            // Display output info 1 decimal place
            NumberFormat number = NumberFormat.getNumberInstance();
            number.setMaximumFractionDigits(1);
            String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n"
                + "Max score: " + max + "\n"
                + "Min score: " + min + "\n";
            System.out.println(message); 
            }
        
        System.out.print("Enter more test scores? (y/n): ");
        moreTests=sc.next();
        }
    
        while(moreTests.compareTo("y") == 0 );    
        // end of do(-while)
    }
}
