package lesson22;

public class Human{
    Human(String name){
        this(name, null);
    }

    Human(String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    private String name;
    private String surname;
}

class Student extends Human{
    Student(String name){
        super(name);
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Student student = new Student("Andrew");
    }
}
