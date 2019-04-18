/*
    CHC-16APR2019
        Newely created enumeration called CustomerType
            Contains three types of customers:
                Retail
                Trade
                College
        Added toString method. Returns a string that contains
        "Retail Customer", "Trade Customer", and "College Customer"
        determined by customer type.
*/

public enum CustomerType 
{
	RETAIL,
	TRADE,
	COLLEGE;

	@Override
	public String toString() 
        {
                String ct = "";
		if (this.ordinal() == 0) 
                    ct = "Retail Customer";
                else if (this.ordinal() == 1)
                    ct = "Trade Customer";
                else if (this.ordinal() == 2)
                    ct = "College Customer";
                return ct;
		
	}
}
