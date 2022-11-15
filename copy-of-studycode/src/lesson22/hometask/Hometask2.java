package lesson22.hometask;

import lesson10.p4.D;

class Animal{
    Animal(){
        System.out.println("I am animal");
    }

    private int eyes;

    public void setEyes(int eyes){
        this.eyes = eyes;
    }

    public void eat(){
        System.out.println("Animal eats");
    }

    public void drink(){
        System.out.println("Animal drinks");
    }

}

class Pet extends Animal{
    Pet(){
        System.out.println("I am pet");
        setEyes(2);
    }

    private String name;
    private final int tail = 1;
    private int paw = 4;

    public void setName(String name){
        this.name = name;
    }

    public void run(){
        System.out.println("Pet runs");
    }

    public void jump(){
        System.out.println("Pet jumps");
    }

    int getPawCount(){
        return paw;
    }
}

class Dog extends Pet{

    Dog(String name){
        setName(name);
        System.out.println("I am dog and my name is: " + name);
    }

    public void play(){
        System.out.println("Dog plays");
    }
}

class Cat extends Pet{

    Cat(String name){
        setName(name);
        System.out.println("I am cat and my name is: " + name);
    }

    public void sleep(){
        System.out.println("Cat sleeps");
    }
}

public class Hometask2 {
    public static void main(String[] args) {
        Dog dog = new Dog("Charlie");
        System.out.println("Total count of paw: " + dog.getPawCount());
        Cat cat = new Cat("Mark");
        cat.sleep();
    }
}
