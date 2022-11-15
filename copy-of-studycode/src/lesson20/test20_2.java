package lesson20;

import java.util.ArrayList;

public class test20_2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        String word1 = new String("Hello");
        String word2 = new String("Hello");
        words.add(word1);
        words.add(word2);

        for (String word : words){
            System.out.println(word + " ");
        }
        System.out.println();
        words.remove("Hello");

        words.clear();

        for (String word : words){
            System.out.print(word + " ");
        }


        for (String word : words){
            System.out.println(word + " ");
        }

    }
}
