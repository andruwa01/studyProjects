package lesson20;

import java.util.ArrayList;

public class test20 {
    public static void main(String[] args) {
        ArrayList<StringBuilder> array = new ArrayList<>();
        StringBuilder arr1 = new StringBuilder("Hi");
        StringBuilder arr2 = new StringBuilder("Hello");
        StringBuilder arr3 = new StringBuilder("Hey");
        array.add(arr1);
        array.add(arr2);
        array.add(arr3);

        for (int i = 0; i < array.size(); i++){
            array.get(i).append("!!!");
        }

        for (StringBuilder item : array){
            System.out.print(item + " ");
        }
        System.out.println();

        for (StringBuilder item :
                array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
