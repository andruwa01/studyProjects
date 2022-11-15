package lesson5;

class Car {

    Car(){
        System.out.println("Object is created!!!");
    }

    String color;
    String engine;
    int currentspeed;

    void changeColor (String newColor){
        color = newColor;
    }

    void changeEngineType (String newEngineType){
        engine = newEngineType;
    }

    void speedUp(int upvalue){
        currentspeed += upvalue;
    }

    void speedDown (int downvalue){
        currentspeed -= downvalue;
    }

    void carInfo (){
        System.out.println("CurrentColor: " + color);
        System.out.println("CurrentEngine: " + engine);
        System.out.println("CurrentSpeed: " + currentspeed);
        System.out.println();
    }

}

class Test5 {
    public static void main(String[] args) {
        Car car1 = new Car();
        System.out.println(car1.color);
        System.out.println(car1.engine);
    }
}