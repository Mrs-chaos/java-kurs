/**
 * Created by c.horsch on 29.07.2014.
 */
public class array2 {

    public static void main(String[] args) {

        //String[] counts = new String[3];
        Employee[] employees = new Employee[2];

        employees[0] = new Employee("hans", "müller", 1800);
        employees[1] = new Employee("lisa", "maier", 2000);

        //for (int i = 0; i < employees.length; i++) {
        //     employees[i] = new Employee("hans","müller",1800);
        //   System.out.println(employees[i]);
        //}

        for (int i = 0; i < employees.length; i++) {
            employees[i].talk();
        }
    }
}
