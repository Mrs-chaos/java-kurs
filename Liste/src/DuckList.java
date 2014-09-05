/**
 * Created by c.horsch on 02.09.2014.
 */
public class DuckList {

    private ListElement firstElement;

    public void add(Duck duckToAdd)
    {
        if (this.firstElement==null) {
            this.firstElement = new ListElement(duckToAdd);
        }else{
            ListElement current=this.firstElement;
            while (current.getNext()!=null) {
                current = current.getNext();
            }
            current.setNext(new ListElement(duckToAdd));
            }
    }



    public void printAll()
    {
        ListElement current=this.firstElement;
        while (current.getNext()!=null) {
            current.print();
            current = current.getNext();
        }
        current.print();

    }
}

