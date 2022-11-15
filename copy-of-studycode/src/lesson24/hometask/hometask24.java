package lesson24.hometask;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class hometask24 {
    public static void main(String[] args) {



        Animal animal1 = new Mechenosec("Alex");
        Animal animal2 = new Pinguin("Kovalski");
        Animal animal3 = new Lion("Leviy");

        Fish fish = new Mechenosec("Alex_2");
        Bird bird = new Pinguin("Kovalski_2");
        Mammal mammal = new Lion("Leviy_2");

        Mechenosec mechenosec = new Mechenosec("Alex_3");
        Pinguin pinguin = new Pinguin("Kovalski_3");
        Lion lion = new Lion("Liviy_3");

        Speakable speakable1 = new Pinguin("Kovalski_4");
        Speakable speakable2 = new Lion("Leviy_4");

        Speakable [] speakables = {speakable1, speakable2, bird, mammal, pinguin, lion};
        Animal [] animals = {animal1, animal2, animal3, fish, mechenosec, bird, mammal, pinguin, lion};

        for (Animal animal : animals){
            if (animal instanceof Mechenosec){
                animal.sleep();
                animal.eat();
                ((Fish)animal).swim();
            } else if (animal instanceof Pinguin){
                animal.sleep();
                animal.eat();
                ((Bird) animal).speak();
                ((Bird) animal).fly();
            } else if (animal instanceof Lion){
                animal.sleep();
                animal.eat();
                ((Lion) animal).speak();
                ((Lion) animal).run();
            }
            System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        }
        for (Speakable speakable : speakables){
            if (speakable instanceof Mechenosec){
                Mechenosec newmechenosec = (Mechenosec) speakable;
                System.out.println(newmechenosec.name);
                newmechenosec.sleep();
                newmechenosec.eat();
                newmechenosec.swim();
            } else if (speakable instanceof Pinguin){
                Pinguin pinguin1 = (Pinguin) speakable;
                pinguin1.eat();
                pinguin1.sleep();
                pinguin1.speak();
                pinguin1.fly();
            }
            else if (speakable instanceof Lion){
                Lion lion1 = (Lion) speakable;
                System.out.println(lion1.name);
                lion1.eat();
                lion1.sleep();
                lion1.run();
                lion1.speak();
            }
        }
    }
}

abstract class Animal{
    Animal(String name){
        this.name = name;
    }
    String name;
    abstract void eat();
    abstract void sleep();
}

abstract class Fish extends Animal{
    Fish(String name){
        super(name);
    }
    abstract void swim();

    @Override
    void eat() {
        System.out.println("Fish eats");
    }

    @Override
    void sleep() {
        System.out.println("Fish is sleeping");
    }
}

class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
    }
    void swim(){
        System.out.println("Mechenosec is wonderful fish, that can swim");
    }
    void eat(){
        System.out.println("Mechenosec eats common food for fish");
    }
}

abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
    }
    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + " sings");
    }
}

class Pinguin extends Bird{
    Pinguin(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Pinguin like eat fish");
    }
    @Override
    void sleep(){
        System.out.println("Pinguins sleeps near each other");
    }

    @Override
    void fly() {
        System.out.println("Pinguins can't fly");
    }

    @Override
    public void speak() {
        System.out.println("Pinguins can't singing like nightingale");
    }
}

abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
    }
    abstract void run();
}

class Lion extends Mammal{
    Lion(String name){
        super(name);
    }

    @Override
    void eat() {
        System.out.println("Lion like meat kak luboi hishnik");
    }

    @Override
    void sleep() {
        System.out.println("Bolshyy chast dnya on spit");
    }

    @Override
    void run() {
        System.out.println("Lion is not samaya bistrya coshka");
    }
}

interface Speakable{
    default void speak(){
        System.out.println("Somebody speaks");
    }
}