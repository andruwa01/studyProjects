package lesson18;

import java.util.Arrays;

public class ComparsionTest {
    static void GetMaxMinELement(int[] array){
        Arrays.sort(array);
        System.out.println("Minimal: " + array[0]);
        System.out.println("Max: " + array[array.length - 1]);
    }
    public static void main(String[] args) {
        int[] array = {1, -8, 3, 4, 6};
        GetMaxMinELement(array);
    }
}
