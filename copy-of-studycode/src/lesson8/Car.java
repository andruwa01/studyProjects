package lesson8;

public class Car {
    public static String color = "blue";
    public static String engine = "V6";
}

class Human {
    String name = "Ivan";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c.color = "Red";
    }
}
