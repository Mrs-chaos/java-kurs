/**
 * Created by c.horsch on 31.08.2014.
 */
public class List {

    private ListElement firstElement;

    public void add(Person person) {
        if(firstElement==null) {
            firstElement = new ListElement(person);
        }else {
            firstElement.add(person);

        }

    }
    public void print()
    {
    firstElement.print();
    }

    public static void main(String[] args) {
        List myList = new List();
        myList.add(new Person("Hans"));
        myList.add(new Person("Claudia"));
        myList.add(new Person("Tobias"));
        myList.print();
    }
}
