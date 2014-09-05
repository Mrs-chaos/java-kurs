/**
 * Created by c.horsch on 24.08.2014.
 */
public class Main {
    public static void main(String[] args) {
        Division division1 = new Division("HR","10001",20000);
        division1.showall();

        Employee employee1=new Employee("Benny");
        division1.hire(employee1);
        division1.showall();

        Employee employee2=new Employee("Lola");
        division1.hire(employee2);
        division1.showall();
        division1.showDivision("HR");
}

}
