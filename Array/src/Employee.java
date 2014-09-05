/**
 * Created by c.horsch on 29.07.2014.
 */
public class Employee {

    private String firstname;
    private String lastname;
    private int salary;
    private int salaryraise =0;
    private String exitDate = "-";
    private String company = "reBuy";
    private String ersthelfer = "Nein";


    public Employee (String firstname, String lastname, int salary)
    {
        this.firstname=firstname;
        this.lastname=lastname;
        this.salary=salary;
    }

    public void talk ()
    {
        System.out.println(firstname+" "+lastname);
    }

    public void leave()
    {
        this.company="other";
        this.ersthelfer="Nein";
        this.exitDate="today";
    }

    public void salaryraise(int x)
    {
        if (this.salaryraise < 1) {
            this.salary = salary;
        }else{
            this.salary= salary+x;
        }
    }

    public String getName()
    {
        return firstname+" "+lastname;
    }

    public void setLastname(String lastname)
    {
        this.lastname=lastname;
    }

    public void setSalaryraise(int salaryraise)
    {
        this.salaryraise=salaryraise;
    }

    public void setErsthelfer(String ersthelfer)
    {
        this.ersthelfer=ersthelfer;
    }

    public void show ()
    {
        System.out.println("Gehalt:"+salary);
        System.out.println("Gehaltserhöhung:"+salaryraise);
        System.out.println("Firmenzugehörigkeit:"+company);
        System.out.println("Ersthelfer:" + ersthelfer);
        System.out.println("Austritt:"+exitDate);
    }


}
