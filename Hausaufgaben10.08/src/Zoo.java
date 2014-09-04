/**
 * Created by c.horsch on 10.08.2014.
 */
public class Zoo {
    int x=0;
    private Elephant[] elephants = new Elephant[x];

    public void addElephant(Elephant newElephant){
        Elephant[] newElephants  = new Elephant[x=x+1];
        for (int i=0; i < elephants.length; i++) {
            newElephants[i]= elephants[i];
        }
        newElephants[newElephants.length-1]= newElephant;

        this.elephants = newElephants;
    }


    public void print() {
        for (int i=0; i < elephants.length; i++) {
             elephants[i].showall();
        }
    }
}
