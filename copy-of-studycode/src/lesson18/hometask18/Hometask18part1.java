package lesson18.hometask18;
public class Hometask18part1 {
    static void sort(int[] array){
        for (int j = 0; j < array.length - 1; j++){
            for (int i = j + 1; i < array.length; i++) {
                int min = array[j];
                if (array[i] <= min) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {33, 0, 11, 1, 2};

        sort(arr1);

        for (int item : arr1){
            System.out.print(item + " ");
        }
    }
}
