package lesson26;

public class Test26 {
    int a = 6;
    Test26(){
        a = 6;
        System.out.println("This is constructor");
    }
    {
        a = 5;
    }
    public static void main(String[] args) {
        Test26 test26 = new Test26();
        System.out.println(test26.a);
    }
}

class a {
    static final int a;
    int b;
    static {
        a = 5;
    }
}

class b {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;
    static {
        c = 5;
        d = 3;
        // e = 2;
        f = 0;
    }
}

class C {
    String s = "ok";
    {
        System.out.println(s);
    }
    static int i = 0;
    static {
        System.out.println(i);
    }
    {
        i++;
        System.out.println(i);
    }
    C(){
        System.out.println("this is constructor of C");
    }

    public static void main(String[] args) {
        System.out.println("Hello, all");
        C c = new C();
    }
}

class D{
    static char c = 55;
    static void abc(int a){ System.out.println(a + " ");}
    static {abc(2);}
    static {abc(4);}
    static {new D();}
    {abc(6);}
    {abc(8);}
    D(){abc(5);}

    public static void main(String[] args) {
        System.out.println(c);
    }
}
