/**
 * Created by c.horsch on 31.08.2014.
 */
public class Main {
    public static void main(String[] args) {

        int[] unsorted = new int[]{10,9,8,7};
        int[] sorted = sort(unsorted);
        for (int i = 0; i < sorted.length; i++) {
            System.out.println(sorted[i]);
        }
    }

    private static int[] sort(int[] toSort) {
        boolean change = false;
        do{
            change=false;
            for (int i = 0; i < toSort.length - 1; i++) {
                if (toSort[i] > toSort[i + 1]) {
                    change(toSort, i);
                    change = true;
                }
            }
        } while (change==true);
        return toSort;
    }


    private static int[] change(int[] toSort, int i) {
        int x = toSort[i + 1];
        toSort[i + 1] = toSort[i];
        toSort[i] = x;
        return toSort;
    }
}
