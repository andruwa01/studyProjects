package lesson16;

public class Car {
    String color;
    String engine;

    Car(String color, String engine) {
        this.color = color;
        this.engine = engine;
    }

    final static int c = 5;

    public Car carWithColourWithV4(String color){
        Car newcar = new Car(color, "V4");
        return newcar;
    }

    public static void main(String[] args) {
        Car car1 = new Car("Red", "v6");
        Car car2 = car1.carWithColourWithV4("Black");
        System.out.println(car1.color);
    }

}
