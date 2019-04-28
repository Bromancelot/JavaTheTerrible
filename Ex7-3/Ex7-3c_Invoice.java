/*
  CHC-7MAR2019
          Created a class named Invoice.
          Included 2 private fields for the customer type, and subtotal
          entered by the user.
          Included single constructor.
 */

import java.text.NumberFormat;

public class Invoice 
{
    String customerType;
    double subtotal;	
    double discountP;
		     
	// CONSTRUCTORS
    public Invoice()
    {
      this.subtotal = 0;
	    this.customerType = " ";
	    this.discountP = 0;
    }

    public Invoice(String customerType, double subtotal, double discountP)
	  {
            this.subtotal = subtotal;
            this.customerType = customerType;
            this.discountP = discountP;
	  }
	
    public void setSubtotal(double subtotal)
    {
        this.subtotal = subtotal;
    }
    
    public double getSubtotal()
    {
        return subtotal;
    }

    public void setCustomerType(String customerType)
    {
	this.customerType = customerType;
    }
	
    public String getCustomerType()
    {
        return customerType;
    }
	
    public void setdiscountP(double discountP)
    {
	this.discountP = discountP;
    }
    
    public double getdiscountP()
    {
	return discountP;
    }
	
    public static double getDiscountPercent(double subtotal, String customerType)
    {
	double discountPercent = 0.0;
	if (customerType.equalsIgnoreCase("r"))
	{
	         if (subtotal >= 500)
	             discountPercent = .2;
	         else if (subtotal >= 250 && subtotal < 500)
	             discountPercent =.15;
	         else if (subtotal >= 100 && subtotal < 500)
	             discountPercent =.1;
	         else if (subtotal < 100)
	             discountPercent =.0;
	}
	else if (customerType.equalsIgnoreCase("c"))
	{
            discountPercent = .2;
	}
	else
        {
	    discountPercent = .05;
        }
        
        return discountPercent;
    }

    public String getInvoice()
    {
        double discountAmount = subtotal * discountP;
        double invoiceTotal = subtotal - discountAmount;
        
        //Format the numbers
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        NumberFormat percent = NumberFormat.getPercentInstance();
        
        String sSubtotal = currency.format(subtotal);
        
        //Customer Types
        String sCustomerType = "";
        
        if (customerType.equalsIgnoreCase("r"))
	sCustomerType = "Retail";
        
        else if (customerType.equalsIgnoreCase("c"))
	sCustomerType = "College";
        
        
        String sDiscountPercent = percent.format(discountP);
        String sDiscountAmount = currency.format(discountAmount);
        String sTotal = currency.format(invoiceTotal);
        
        String message = "Subtotal:         " + sSubtotal + "\n"
            + "Customer type:    " + sCustomerType + "\n"
            + "Discount percent: " + sDiscountPercent + "\n"
            + "Discount amount:  " + sDiscountAmount + "\n"
            + "Total:            " + sTotal + "\n";
	return message;
    } 
}
