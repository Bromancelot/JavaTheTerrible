import java.text.NumberFormat;
import java.util.Scanner;

/*
    CHC-14FEB2019
        Added type "R", "T", and "C" customer types. 
        R Customers get a 25% discount if >=$250 but <$500. Those with a 
            subtotal of $500 get a 30% discount
        C Customers always get a 20% discount.
        T Customers get a 40% discount for subtotals of <$500, and a 
            50% discount for subtotals >= $500
        Customers with no type don't get a discount.
        
        Added new method called getDiscountPercent. Includes customer type,
            and subtotal.
*/



public class InvoiceApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (!choice.equalsIgnoreCase("n")) {
            // get the input from the user
            System.out.print("Enter customer type (r/c/t): ");
            String customerType = sc.next();
            System.out.print("Enter subtotal:   ");
            double subtotal = sc.nextDouble();

            // get the discount percent
            double discountPercent = 0.0;
            switch(customerType) {
                case "r":
                case "R":
                    if (subtotal < 100) {
                        discountPercent = 0.0;
                    } else if (subtotal >= 100 && subtotal < 250) {
                        discountPercent = .1;
                    } else if (subtotal >= 250 && subtotal < 500) {
                        discountPercent = .25;
                    } else if (subtotal > 500) {
                        discountPercent = .3;
                    }
                    break;
                case "c":
                case "C":
                    discountPercent = .20;
                    break;
                case "t":
                case "T":
                    if (subtotal < 500) {
                        discountPercent = .4;
                    } else {
                        discountPercent = .5;
                    }
                    break;
            }

            // calculate the discount amount and round to 2 decimals
            double discountAmount = subtotal * discountPercent;
            discountAmount = Math.ceil(discountAmount * 100) / 100;

            // calculate the total
            double total = subtotal - discountAmount;

            // format and display the results
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            NumberFormat percent = NumberFormat.getPercentInstance();
            System.out.println(
                "Discount percent: " + percent.format(discountPercent) + "\n"
              + "Discount amount:  " + currency.format(discountAmount) + "\n"
              + "Total:            " + currency.format(total) + "\n");

            // see if the user wants to continue
            System.out.print("Continue? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
}
