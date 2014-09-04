/**
 * Created by c.horsch on 10.08.2014.
 */
public class MainZoo {
    public static void main(String[] args) {
    Zoo berlin=new Zoo();
        berlin.print();
        Elephant elephant = new Elephant("Dumbo", "m", "asian");
        berlin.addElephant(elephant);
        berlin.print();
    }
}
