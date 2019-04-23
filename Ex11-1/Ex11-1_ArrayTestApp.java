/*

    CHC-21APR2019
        Created a one-dimensional array of 99 double values
        Used Math.random to add a random number between 0-100
        Enhanced for loop sums the values. They're then averaged and printed
        Sort method gets and prints the median(50th value)
        Prints the 9th value and every 9th value after that.

*/

import java.util.Arrays;
 
public class ArrayTestApp
{
    public static void main(String[] args)
    {
    double[] testArray = new double [99];
 
   //add a random number to each element in the array
    for (int i=0; i < testArray.length; i++)
    testArray[i] = 100.0*Math.random(); 
 
   //get sum
    double sum = 0.0;
    for(double a: testArray)
    {
        sum += a;
    }
   //get and print average
    double average = sum/testArray.length; 
    System.out.println("Average is: " + average);
    System.out.println();   
 
   //sort, then print the median
    Arrays.sort(testArray);
    System.out.println("Median is: " + testArray[testArray.length/2]);
    System.out.println();
 
   //using formatting to print the 9th value and every 9th value after
    for (int i = 9; i < testArray.length; i = i + 9) 
    {
    //because it looks nicer
    System.out.printf("Value %2d is: %f%n", i, testArray[i]);
    }
  }
}
