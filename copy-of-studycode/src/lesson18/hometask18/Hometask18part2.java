package lesson18.hometask18;

public class Hometask18part2 {
    static void showArray(String[][] strings ){
        System.out.print("{ ");
        for (int i = 0; i < strings.length; i++){
            System.out.print("{");
            for (int j = 0; j < strings[i].length; j++){
                System.out.print(strings[i][j]);
                if (j != strings[i].length - 1) {
                    System.out.print(", ");
                }
            }
            if (i == strings.length - 1) {
                System.out.print("}");
            } else {
                System.out.print("},");
            }
        }
        System.out.print(" }");
        System.out.println();
    }

    public static void main(String[] args) {
        String[][] strings = {{"Hello", "World"},{"Hi"},{"My", "Name", "Is"}};
        showArray(strings);
        String[][] strings1 = {{"Hello", "Hi"}, {"Hey"}};
        showArray(strings1);
    }
}
