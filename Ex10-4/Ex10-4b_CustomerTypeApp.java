/*
    CHC-16APR2019
        Added a method the returns a discount price based on customer type.
        .10 for Retail
        .30 for Trade
        .20 for College
        Added main method that declares a CustomerType variable. This assigns
        a type, the appropriate discount, then displays the discount.
*/


public class CustomerTypeApp
{
    public static void main(String[] args)
    {
		  //declare customerType variable
			CustomerType test = CustomerType.COLLEGE;
			double discount = 0;	 

		  // display a welcome message
        System.out.println("Welcome to the Customer Type Test application\n");

        // get and display the discount percent for a customer type
		  discount = getDiscountPercent(test);
                  System.out.println("Customer type: " + test.toString());
		  System.out.println("Discount percent: " + (discount * 100) + "%");
        // display the value of the toString method of a customer type

    }

    // a method that accepts a CustomerType enumeration
	 public static double getDiscountPercent(CustomerType type) 
         {
		double discount = 0;
		switch (type) 
                {
			case RETAIL: discount = 0.1;
				break;
			case TRADE: discount = 0.3;
				break;
			case COLLEGE: discount = 0.2;
				break;
			default:
				break;
		}
		return discount;
	}
}
