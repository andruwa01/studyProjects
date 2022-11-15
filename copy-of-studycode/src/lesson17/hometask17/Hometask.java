package lesson17.hometask17;

public class Hometask {
    static boolean equality(StringBuilder str1, StringBuilder str2) {
        if (str1.length() != str2.length()) {
            return false;
        } else {
            int counter = 0;
            for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(i)) {
                    counter++;
                }
            }
            return counter == str1.length();
        }
    }

    public static void main(String[] args) {
        System.out.println(equality(new StringBuilder("Hello"), new StringBuilder("Hey")));
    }
}
