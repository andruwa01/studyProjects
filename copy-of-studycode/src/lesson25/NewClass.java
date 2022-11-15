package lesson25;

public class NewClass {
}

class Car{
    static int a = 5;

    public static void main(String[] args) {
        Car c = new Car();
        System.out.println(a);
        System.out.println();
        c = null;
        System.out.println(a);
    }
}
