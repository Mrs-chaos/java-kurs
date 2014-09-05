/**
 * Created by c.horsch on 20.07.2014.
 */
public class Aufgabe3
{
    public static void main(String[] args)
    {
        printTriangle(6);
    }

    private static void printTriangle(int height)
    {
        int count= 1;
        int spacecount=height;

        for (int i=0; i<height; i=i+1)
        {
            printLine(count, spacecount);

            count=count+2;
            spacecount=spacecount-1;
            System.out.println();
        }
    }

    private static void printLine(int count, int spacecount)
    {
        String space=" ";
        String hashmarks="#";

        for (int j=0; j<spacecount; j=j+1)
        {
            System.out.print(space);
        }

        for (int j=0; j<count; j=j+1)
        {
            System.out.print(hashmarks);

        }

    }
}
