package lesson23;

//Важный пример для понимание того, как вызываются методы и для понимания CompileTime и RunTime binding

public class Animal {
    static String showName(){
        return "animal's name";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of the animal: " + showName());
    }
}

class Mouse extends Animal{
    static String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of the mouse: " + showName());
    }

    public static void main(String[] args) {
        Mouse animal = new Mouse();
        animal.showInfoAboutAnimal();
        animal.showInfoAboutMouse();

    }
}
