public class DisplayableTestApp
{
    public static void main(String args[])
    {
        System.out.println("Welcome to the Displayable Test application\n");

        // create an Employee object
        Displayable e = new Employee (2,"Smith","John");
        
        // display the employee information
        display(e);

        System.out.println();

        // create a Product object
        Displayable p = new Product("java", "Murach's Java Programming", 57.50);
        
        // display the product information
        display(p);
        
        System.out.println(); 
    }
    
    private static void display(Displayable d) 
    {
        System.out.println(d.getDisplayText());
    }

}
