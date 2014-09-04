/**
 * Created by c.horsch on 10.08.2014.
 */
public class Elephant {

    private String sound = "törö";
    private String name ;
    private String gender;
    private String nation;
    private int cagenumber=1;
    private boolean hungy = false;
    private boolean feeded = true;

    public Elephant(String name, String gender, String nation)
    {
        this.name=name;
        this.gender=gender;
        this.nation=nation;
    }

    public void speak()
    {
        System.out.println(sound);
    }

    public void setCagenumber(int cagenumber)
    {
        this.cagenumber=cagenumber;
    }

    public void setFeeded(boolean feeded)
    {
        this.feeded=feeded;
        if (this.feeded!= true)
        {this.hungy= true;}
        else {
            this.hungy= false;}
    }


    public void showall ()
    {
        System.out.println(name);
        System.out.println(gender);
        System.out.println(nation);
        System.out.println(cagenumber);
        System.out.println("Gefüttert:"+feeded);
        System.out.println("Hunger:"+hungy);
    }

   public Elephant breed(Elephant otherElephant)
   {
       String childGender;
       String childNation;
       String childName;


       if ((int)(Math.random()*2)==0){
           childGender="w";
       }else{
           childGender="m";
       }

       if (childGender.equals(this.gender)){
           childName=this.name+" Junior";
       }else{
           childName= otherElephant.name+" Junior";
       }

       if (this.nation.equals(otherElephant.nation)){
           childNation=this.nation;
       }else{
           childNation="mixed";
       }

       Elephant childElephant= new Elephant(childName,childGender,childNation);
       return childElephant;
   }
}
