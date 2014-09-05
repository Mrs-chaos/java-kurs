/**
 * Created by c.horsch on 02.09.2014.
 */
public class ListElement {

    private Duck duck;

    private ListElement next;

    public ListElement (Duck duck)
    {
        this.duck=duck;
    }

    public void setNext (ListElement nextElement)
    {
        this.next=nextElement;
    }

    public ListElement getNext()
    {
        return this.next;
    }

    public void print()
    {
       System.out.println(duck.getName());
    }
}
