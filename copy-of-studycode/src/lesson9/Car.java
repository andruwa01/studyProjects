package lesson9;

public class Car {

    String color;
    String engine;
    static int count;
    int a = 10;
    public Car (String color, String engine){
        count++;
        this.color = color;
        this.engine = engine;
    }

    public void showColor(){
        System.out.println("Color of car: " + color);
        changeColor("Red");
    }

    void changeColor (String color){
        this.color = color;
        System.out.println(this.color);
    }

    public static void main(String[] args) {
        Car c = new Car("Red", "V6");
        System.out.println(c.color);
        c.changeColor("Black");
        System.out.println(c.color);
    }
}
