package testing.testing2;

class ParentClass {
    String s = "Hello";
    void abc(){
        System.out.println("???");
    }
}

class ClassTest extends ParentClass{
    String s = "Hi";
    void abc(){
        System.out.println("!!!");
    }
}

public class MainTest extends ClassTest{
    public static void main(String[] args) {
        MainTest test = new MainTest();
        test.abc();
        System.out.println(test.s);
    }
}


