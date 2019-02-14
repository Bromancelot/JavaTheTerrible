    import java.util.Scanner;
    
    /*
      CHC-14FEB2019
        So on and so forth.
    */

    public class TestScoreApp 
    {  
         
    	public static void main(String args[ ]) 
       {
    	
    		Scanner kbd = new Scanner(System.in);
    	
    	//total number of test scores possible in CS 200
    		final int MAX_SIZE = 10;  
    	//Create (declare & instantiate) an int array of size 10, called: testScore
    		int [] testScore = new int[MAX_SIZE];
    	//Declare any other variable storage space needed by the program
    		int number;
    		int scoreTotal =0;
    		int averageScore =0;
    		int index;
    		int scoreCount =0;
    			
    	/*Initialize the first 7 values to your test scores thus far in this course from user keyboard input 
    	with a "do-while loop", sentinel value (-1) to stop loop,
    	and count to keep track of how many values you have assigned to the array. */
    	do
    	{
    		System.out.println("Please enter your test scores. Enter 999 to quit.");
    		number = kbd.nextInt();
    		testScore[scoreCount] = number;
    		
    		if(testScore[scoreCount] != 999)
    		{
    			scoreCount++;
    		}
    		}
    		while(number != -1 && scoreCount < testScore.length);	
    	
    	/*Next, use the counter from the loop above to run a 
    	"for loop" to total your test scores. */
    	if(scoreCount > 1)
    	{
    	
    		for(index = 0; index < scoreCount; index++)
    		{
    			scoreTotal = scoreTotal + testScore[index];
    		}
    			if(number == -1)
    			{
    	
    	/*Then, find the average score of your testzes thus far 
    	using the total divided by the scoreCounter*/
    			averageScore = scoreTotal / scoreCount;
    			}
    			else
    			{
    				averageScore = scoreTotal/scoreCount;
    			}
    		}
    	
    	//Display (echo) your individual scores 
    		for(index = 0; index < scoreCount; index++)
    		{			
    			System.out.print(testScore[index] + " ");
    		}
    	
    	//Display the total number of the scores
    		System.out.println();
    		System.out.println("The total of the test scores is: " + scoreTotal);
    	
    	//Display the test score average
    	System.out.println("The average test score is: " + averageScore);				
      
      } //closing main method
    } //closing class header



import java.util.Scanner;

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
        double averageScore = scoreTotal / scoreCount;
        String message = "\n" +
                         "Score count:   " + scoreCount + "\n"
                       + "Score total:   " + scoreTotal + "\n"
                       + "Average score: " + averageScore + "\n";
        System.out.println(message);
    }
}
