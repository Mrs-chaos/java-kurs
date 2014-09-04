/**
 * Created by c.horsch on 31.08.2014.
 */
public class ListElement {

    private ListElement nextElement;
    private Person person;

    public ListElement(Person person) {
        this.person=person;
    }

    public void add(Person person) {
        if(nextElement==null) {
            nextElement = new ListElement(person);
        }else{
            nextElement.add(person);
        }
    }

    public void print()
    {
    this.person.print();
        if(nextElement!=null) {
            nextElement.print();
        }
    }

}
