/**
 * Created by c.horsch on 02.09.2014.
 */
public class Main {
    public static void main(String[] args) {

        DuckList myDuckList = new DuckList();
        Duck duck= new Duck("Hans");
        myDuckList.add(duck);
        Duck duck2= new Duck("Cora");
        myDuckList.add(duck2);
        Duck duck3= new Duck("Alex");
        myDuckList.add(duck3);

        myDuckList.printAll();
    }
}
