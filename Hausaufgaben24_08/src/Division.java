/**
 * Created by c.horsch on 24.08.2014.
 */
public class Division {

    private String name ;
    private String costCenter;
    private int budget;
    private int countEmployees=0;
    private Employee [] employees= new Employee[20];

    public Division(String name, String costCenter, int budget)
    {
        this.name=name;
        this.costCenter=costCenter;
        this.budget=budget;
    }

    public void getCountEmployees(int countEmployees)
    {
        System.out.println(countEmployees);
    }

    public void hire (Employee newEmployee )
    {
        this.employees[countEmployees]=newEmployee;
        this.countEmployees=countEmployees+1;
        newEmployee.setDivision(this.name);
        //      Employee [] newEmployees = new Employee[1];
        //    for(int i=0; i<employees.length;i++) {
        //     newEmployees[i]=employees[i];
        // }
        // newEmployees[newEmployees.length-1]=newEmployee;
        //this.employees=newEmployees;
    }

    public void showDivision(String name)
    {
        if (name==this.name) {
            for (int i = 0; i < countEmployees; i++) {
                employees[i].showEmployee();
            }
        }
    }


    public void showall ()
    {
        System.out.println(name);
        System.out.println("Kostenstelle:"+costCenter);
        System.out.println("Budget:"+budget);
        System.out.println("Mitarbeiter:"+countEmployees);
        for (int i=0; i < countEmployees; i++) {
            employees[i].showEmployee();
        }
     }



}
