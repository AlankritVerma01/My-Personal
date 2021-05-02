package Part3;
public class Employee 
{
    private String name;
    private String empId;
    public Employee()
    {
        name = null;
        empId= null;
    }

    public Employee(String nm , String id, int py)
    {
        name = nm;
        empId = id;
        System.out.print(name + " " + empId + py);
    }

    public Employee(String nm , String id)
    {
        name = nm;
        empId= id;
        System.out.println("Employee.enclosing_method()");
    }

    public static void main(String[] args)
    {
        new Employee("Miriah" , "888");
        new Employee("Simon" , "7628" , 6000);
    }
}
