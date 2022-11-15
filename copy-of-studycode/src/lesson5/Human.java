package lesson5;

public class Human {
    String name;
    Car3 car;
    BankAccount ba;
    void HumanInfo(){
        System.out.println("Name: " + name + "\nCarcolor: " + car.color + "\nBankBalance: " + ba.balance);
    }

}

class HumanTest {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.name = "David";
        human1.car = new Car3("Red", "V6");
        human1.ba = new BankAccount(5, 34.4534);
        human1.HumanInfo();

    }
}

class Car3 {
    Car3 (String newColor, String newEngine){
        color = newColor;
        engine = newEngine;
    }
    String color;
    String engine;
}

class BankAccount {
    BankAccount (int newid, double newbalance){
        id = newid;
        balance = newbalance;
    }
    int id;
    double balance;
}
