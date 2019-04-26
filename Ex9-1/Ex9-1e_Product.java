/*

    CHC-09APR2019
        Product class now uses getDisplayText method from Displayable

*/

import java.text.NumberFormat;

public class Product implements Displayable
{
    private String code;
    private String description;
    private double price;

    public Product()
    {
        this.code = "";
        this.description = "";
        this.price = 0;
    }

    public Product(String code, String description, double price)
    {
        this.code = code;
        this.description = description;
        this.price = price;
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
    public String getDisplayText() 
    {
        return "Product Code        : " + this.code 
            + "\nProduct Description : " + this.description
            + "\nProduct Price       : " + this.getFormattedPrice() + "\n";
    }
}
