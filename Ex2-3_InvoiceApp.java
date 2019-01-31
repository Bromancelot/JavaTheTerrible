import java.util.Scanner;

/*
    CHC-31Jan2019
        
        1. Program now displays the total number of invoices submitted.
        2. Program now displays the average invoice amount, and average
           discount amount after invoices are submitted.
        3. Program now gives a discount price of 25% of any invoice of 
           500 or more
*/

public class InvoiceApp
{
    public static void main(String[] args)
    { 
        int invoiceTotals = 0;
        double discountTotal = 0;
        double invoiceTotal = 0;
        
        // welcome the user to the program
        System.out.println("Welcome to the Invoice Total Calculator");
        System.out.println();  // print a blank line

        // create a Scanner object named sc
        Scanner sc = new Scanner(System.in);

        // perform invoice calculations until choice isn't equal to "y" or "Y"
        String choice = "y";
        // the "no" option
        while (!choice.equalsIgnoreCase("n"))
        {
            // get the invoice subtotal from the user
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // calculate the discount amount and total
            double discountPercent= 0.0;
            if (subtotal >= 500)
                discountPercent = .25;
            else if (subtotal >= 200)
                discountPercent = .2;
            else if (subtotal >= 100)
                discountPercent = .1;
            else
                discountPercent = 0.0;

            double discountAmount = subtotal * discountPercent;
            double total = subtotal - discountAmount;
            discountTotal += discountAmount;
            invoiceTotal += total;


            // display the discount amount and total
            String message = "Discount percent: " + discountPercent + "\n"
                           + "Discount amount:  " + discountAmount + "\n"
                           + "Invoice total:    " + total + "\n";
            System.out.println(message);

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
            
            invoiceTotals ++;
        }
        
        // calculates and shows the average discounts and invoice totals
            {
            double averageInvoiceAmount = invoiceTotal/invoiceTotals;
            double averageDiscount = discountTotal/invoiceTotals;
            String message2 = "\n"
                        + "Number of Invoices: " + invoiceTotals + "\n"
                        + "Average Invoice Amount: " + averageInvoiceAmount + "\n"
                        + "Average Discount: " + averageDiscount + "\n";
            System.out.println(message2);
            }
        
    }
}
