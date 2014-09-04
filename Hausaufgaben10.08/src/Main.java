/**
 * Created by c.horsch on 10.08.2014.
 */
public class Main {

    public static void main(String[] args) {

        Elephant elephant1 = new Elephant("Dumbo", "m", "asian");
        elephant1.speak();
        elephant1.setFeeded(false);
        elephant1.showall();


        Elephant elephant2 = new Elephant("Gina", "w", "african");
        elephant2.setCagenumber(2);
        elephant2.showall();


        Elephant elephant3 = elephant2.breed(elephant1);
        elephant3.showall();

        System.out.println("Und hier kommt der Zoo!");

        Zoo berlin=new Zoo();
        berlin.print();
        berlin.addElephant(elephant1);
        berlin.addElephant(elephant2);
        berlin.addElephant(elephant3);
        berlin.print();
    }
}
