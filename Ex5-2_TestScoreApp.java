import java.util.Scanner;
import java.text.NumberFormat;

/*
    CHC- 23Feb2019
        copied the getInt and getIntWithinRanged methods from 
        FutureValueValidation
        Made sure ranges allow entries between 0 and 100. As well as
        ACTUALLY allowing you to enter "0" and "100".
*/

public class TestScoreApp
{
    public static void main(String[] args)
    {
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        double averageScore = 0;

        Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (!choice.equalsIgnoreCase("n"))
        {
            // get the input from the user
            
            //Actually forces the app to allow scores of "0" and "100"
            testScore = getIntWithinRange(sc, "Enter Score: ", -1, 101);

            scoreCount += 1;
            scoreTotal += testScore;

            averageScore = (double) scoreTotal / (double) scoreCount;

            // see if the user wants to enter more test scores
            System.out.print("Enter another test score? (y/n): ");
            choice = sc.next();
            
            //discards any extra entries on the line
            sc.nextLine();
        }
        
        // Displays average, total, and number of tests counted
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(1);
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + number.format(averageScore) + "\n";
        System.out.println(message);
    }
	//copied getInt
	public static int getInt(Scanner sc, String prompt)
     {
         int i = 0;
         boolean isValid = false;
         while (isValid == false)
         {
             System.out.print(prompt);
             if (sc.hasNextInt())
             {
                 i = sc.nextInt();
                 isValid = true;
             }
             else
             {
                 System.out.println("Error! Invalid integer value. Try again.");
             }
             sc.nextLine();  // discard any other data entered on the line
         }
         return i;
     }
          // Copied getIntWithinRange
	  public static int getIntWithinRange(Scanner sc, String prompt,
     int min, int max)
     {
         // fixed error messages to say "0" and "100" to be displayed after
         // I changed the min and max values.
         int i = 0;
         boolean isValid = false;
         while (isValid == false)
         {
             i = getInt(sc, prompt);
             if (i <= min)
                 System.out.println(
                     "Error! Number must be greater than 0.");
             else if (i >= max)
                 System.out.println(
                     "Error! Number must be less than 100.");
             else
                 isValid = true;
         }
         return i;
     }

}
