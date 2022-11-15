package lesson6;

public class MethodOverloading {

    void show(int i1) {
        System.out.println(i1);
    }

    void show(boolean b1) {
        System.out.println(b1);
    }

    void show(String str1) {
        System.out.println(str1);
    }

    void show(String str2, int a){
        System.out.println("String str2: " + str2 + "int: " + a);
    }

    void show(int a, String str2){
        System.out.println("String str2: " + str2 + "int: " + a);
    }
}

class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        int a = 500;
        mo.show(a);
        boolean b = true;
        mo.show(b);
        String str = "Privet";
        mo.show(str);
        mo.show("stringtest ", 5 );
        mo.show(5, "stringtest ");
    }
}