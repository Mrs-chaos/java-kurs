/**
 * Created by c.horsch on 29.07.2014.
 */
public class Main_Employee
    {

        public static void main(String[] args)
        {
            Employee employee1= new Employee("Hanna","Meier",2000);
            employee1.talk();
            employee1.show();
            employee1.leave();
            employee1.show();



            Employee employee2=new Employee("Maik","Lehmann",2500);
            employee2.talk();
            employee2.show();
            employee2.setSalaryraise(1);
            employee2.salaryraise(500);
            employee2.show();

            Employee employee3=new Employee("Peter","Wolf",1800);
            employee3.talk();
            employee3.show();
            employee3.setErsthelfer("Ja");
            employee3.setLastname("Wolf-Zimmermann");
            employee3.talk();

            String test= employee1.getName();
            System.out.println("<<<<"+test);
        }
    }

