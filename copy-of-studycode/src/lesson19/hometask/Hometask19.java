package lesson19.hometask;

public class Hometask19 {
    static void getInfo(String[] arr) {
        for (String string : arr) {
            System.out.print(string + " ");
        }
        System.out.println();
    }

    static String[] abc(String[]... stringarrs) {
        int length = 0;
        for (String[] stringarr : stringarrs) {
            length += stringarr.length;
        }
        String[] allstrings = new String[length];

        int counter = 0;
        for (String[] stringarr : stringarrs) {
            for (String string : stringarr) {
                allstrings[counter] = string;
                counter++;
            }
        }
        return allstrings;
    }

    public static void main(String[] args) {
        String[] arr1 = {"Hello", "a", "world"};
        String[] arr2 = {"Andrew"};
        String[] arr3 = {"3", "0"};

        String[] resultarr = abc(arr1, arr2, arr3);

        getInfo(resultarr);

        for (String string : args) {
            for (int i = 0; i < resultarr.length; i++) {
                if (string.equals(resultarr[i])) {
                    resultarr[i] = null;
                }
            }
        }

        getInfo(resultarr);

    }
}
