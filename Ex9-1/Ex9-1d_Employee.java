/*
    CHC-09APR2019
        Implements the DepartmantConstants and Displayable interfaces.
*/

public class Employee implements Displayable, DepartmentConstants
{
    private int department;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(int department, String lastName, String firstName,
        double salary)
    {
        this.department = department;
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    public String getDisplayText() 
        {
            String departmentName = "";	
            if (department == ADMIN) 
            {
                departmentName = "Admin";
            } 
    
	    else if (department == MARKETING) 
            {
                departmentName = "Marketing";
	    }
	    else if (department == EDITORIAL) 
            {
                departmentName = "Editorial";
            }
            else 
            {
                departmentName = "Unknown Department";
            }

            return ("Department : " + departmentName
                    + "\nFirst Name : " + firstName
                    + "\nLast Name  : " + lastName
                    + "\nSalary     : " + salary);
        }
}
