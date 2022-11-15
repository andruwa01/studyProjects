package lesson20.hometask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeTask20 {
    static ArrayList<String> abc(String ... strings){
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings){
            if (!arrayList.contains(string)){
                arrayList.add(string);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    public static void main(String[] args) {
        ArrayList<String> result = abc("Hello", "1", "Hi", "Hi");
        System.out.println(result);
    }
}
