import java.util.Scanner;
	 
public class InvoiceApp
{
    public static void main(String[] args)
    {
        // display a welcome message
	System.out.println("Welcome to the Invoice Total Calculator");
	System.out.println();  // print a blank line
	 
	Scanner sc = new Scanner(System.in);
	String choice = "y";
	while(choice.equalsIgnoreCase("y"))
	{
            String customerType = Validator.getString(sc, "Enter customer type (r/c): ");
	    double subtotal = Validator.getDouble(sc, "Enter subtotal:  ", 0, 10000);
	    double discountP = Invoice.getDiscountPercent(subtotal, customerType);

	    //Invoice Object
	    Invoice invoice = new Invoice(customerType, subtotal, discountP);
	    String m = invoice.getInvoice();
	    System.out.println();
	    System.out.println(m);
            System.out.print("Continue? (y/n): ");
	    choice = sc.next();
	    System.out.println();
	}
    }  
}


