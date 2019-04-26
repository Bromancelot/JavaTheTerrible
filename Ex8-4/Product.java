import java.text.NumberFormat;

/*
    CHC-28Mar2019
        Added equals method.
*/

public class Product
{
    private String code;
    private String description;
    private double price;

    public Product()
    {
        code = "";
        description = "";
        price = 0;
    }

    public void setCode(String code)
    {
        this.code = code;
    }

    public String getCode()
    {
        return code;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public double getPrice()
    {
        return price;
    }

    public String getFormattedPrice()
    {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    @Override
    public String toString()
    {
        String message =
            "Code:        " + code + "\n" +
            "Description: " + description + "\n" +
            "Price:       " + this.getFormattedPrice() + "\n";
        return message;
    }
	//equals method
	 @Override
	 public boolean equals(Object object) 
         {
	 	if (object instanceof Product) 
                {
			Product product2 = (Product) object;
			if (this.code.equals(product2.getCode()) &&
				 this.description.equals(product2.getDescription()) &&
				 this.price == product2.getPrice()) 
                        {
					return true;
			}
		}
		return false;
	}
		
}