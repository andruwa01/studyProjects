package lesson16.hometask16;

public class alternative {
    static void email (String emails) {
        int i = 0;
        while (i < emails.length() - 1){
            int a = emails.indexOf('@', i);
            int b = emails.indexOf('.', i);
            i = emails.indexOf(';', i + 1);
            System.out.println(emails.substring(a + 1, b));
        }
    }
    public static void main(String[] args) {
        email("ya@yahoo.com; hello@gmail.com;");
    }
}
