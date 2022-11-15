package lesson3;

public class Test3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println(a-- - --a + ++a + a++ + a);
        System.out.println(++b - b++ + ++b - --b);
    }
}
