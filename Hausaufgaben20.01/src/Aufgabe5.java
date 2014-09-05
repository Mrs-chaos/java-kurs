/**
 * Created by c.horsch on 20.07.2014.
 */
public class Aufgabe5
{
public static void main(String[] args)
{

    PrintTree(3, 3);
}

private static void PrintTree(int countTriangle,int smallTriangle)
    {
    int space = countTriangle - 1;

    for (int i = 0; i < countTriangle; i = i + 1)
    {
        printTriangle(smallTriangle, space);
        smallTriangle = smallTriangle + 1;
        space = space - 1;

    }
printLine(3, smallTriangle-2);
System.out.println();
printLine(3, smallTriangle-2);
}

   private static void printTriangle(int height, int buffer)
    {
        int count= 1;
        int spacecount=height+buffer;

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
