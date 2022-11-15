package Lesson11.hometask;

class Car {
    String colour;
    String engine;
    int countdoors;
    Car (String colour, String engine, int countdoors){
        this.colour = colour;
        this.engine = engine;
        this.countdoors = countdoors;
    }

    void getInfoAboutCar (){
        System.out.println(colour);
        System.out.println(engine);
        System.out.println(countdoors);
    }

}

public class CarTest {
    void changeCountDoors (int newcount, Car currentCar){
        currentCar.countdoors = newcount;
        System.out.println("Car's doors was updated ! ! !");
    }

    void swapCars (Car car1, Car car2){
        String swapvar = car1.colour;
        car1.colour = car2.colour;
        car2.colour = swapvar;
    }

    public static void main(String[] args) {
        CarTest car = new CarTest();
        Car car1 = new Car("Red", "V6", 4);
        Car car2 = new Car("White", "V8", 5);
        car.changeCountDoors(9, car1);
        car1.getInfoAboutCar();
        car.swapCars(car1, car2);
        car1.getInfoAboutCar();
        car2.getInfoAboutCar();
    }
}
