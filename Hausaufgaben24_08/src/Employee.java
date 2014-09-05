/**
 * Created by c.horsch on 24.08.2014.
 */
public class Employee {

    private String employeeName ;
    private String employeeDivision;

    public Employee (String employeeName)
    {
        this.employeeName=employeeName;
       // this.employeeDivision=employeeDivision;
    }

    public void showEmployee ()
    {
        System.out.println(employeeName);
    }

    public void setDivision(String name)
    {
        this.employeeDivision=name;
    }

    public void showDivision()
    {

    }
}
