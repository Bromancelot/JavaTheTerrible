/*
    CHC-29Mar2019
        Modified the class to return a CompactDisc object.
*/

public class ProductDB
{
    public static Product getProduct(String productCode)
    {
        // In a more realistic application, this code would
        // get the data for the product from a file or database
        // For now, this code just uses if/else statements
        // to return the correct product data

        Product p = null;

        if (productCode.equalsIgnoreCase("java") ||
           productCode.equalsIgnoreCase("jsps") ||
           productCode.equalsIgnoreCase("mcb2"))
        {
            Book b = new Book();
            if (productCode.equalsIgnoreCase("java"))
            {
                b.setCode(productCode);
                b.setDescription("Murach's Beginning Java");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");
            }
            
            else if (productCode.equalsIgnoreCase("jsps"))
            {
                b.setCode(productCode);
                b.setDescription("Murach's Java Servlets and JSP");
                b.setPrice(49.50);
                b.setAuthor("Andrea Steelman");
            }
            
            else if (productCode.equalsIgnoreCase("mcb2"))
            {
                b.setCode(productCode);
                b.setDescription("Murach's Mainframe COBOL");
                b.setPrice(59.50);
                b.setAuthor("Mike Murach");
            }
            p = b; // set Product object equal to the Book object
        }
        
        else if (productCode.equalsIgnoreCase("txtp"))
        {
            Software s = new Software();
            s.setCode("txtp");
            s.setDescription("TextPad");
            s.setPrice(27.00);
            s.setVersion("4.7.3");
            p = s; // set Product object equal to the Software object
        }
        
        else if (productCode.equalsIgnoreCase("bab"))
        {
            CompactDisc cd = new CompactDisc();
            cd.setCode("bab");
            cd.setDescription("The Beatles: Abby Road"); //Only album that matters
            cd.setPrice(14.00);
            cd.setArtist("The Beatles");
            p = cd; // set Product object equal to the CD object
            
        }
        
        return p;
    }
}