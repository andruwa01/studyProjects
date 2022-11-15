package lesson18;
import java.util.Arrays;
public class ArrayClass {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3};
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        Arrays.sort(array1);
        System.out.println();
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        int ind1 = Arrays.binarySearch(array1, 4);
        System.out.println(ind1);
    }
}
