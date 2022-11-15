package lesson9;

public class Student {
    public int z = 10;
    public static int c = 11;
}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
        System.out.println(st1);
    }
}
