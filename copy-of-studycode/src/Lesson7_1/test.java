package Lesson7_1;

class test1 {
    String i;
}

public class test {
    private int i;

    public static void main(String[] args) {
        test example = new test();
        test1 str = new test1();
        str.i = "Hello";
        example.i = 10;
        System.out.println(example.i);
    }
}
