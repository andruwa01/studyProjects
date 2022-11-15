package lesson24;

public class Employee {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    void eat(){
        System.out.print(name);
        System.out.println(" is eating");
    }
    void sleep(){
        System.out.print(name);
        System.out.println(" is sleeping");
    }

    void testMethod(){
        System.out.println("i am test method from Employee");
    }

    public static void main(String[] args) {

    }

}

class Teacher extends Employee implements HelpAble{
    public void helpSupport(){
        System.out.print(getName());
        System.out.print(" is helping");
    }
    public void fireSupport(){
        System.out.print(getName());
        System.out.print(" is firing");
    }
    void teaching(){
        System.out.print(getName());
        System.out.print(" is teaching");
    }
}


class Doctor extends Employee implements HelpAble, SwimAble{
    public void swim(){
        System.out.print(getName());
        System.out.print(" is swimming");
    }
    public void helpSupport(){
        System.out.print(getName());
        System.out.print(" is helping");
    }
    public void fireSupport(){
        System.out.print(getName());
        System.out.print(" is firing");
    }
    void heals(){
        System.out.print(getName());
        System.out.print(" is healing");
    }
}

interface HelpAble{
    void helpSupport();
    void fireSupport();
}

interface SwimAble{
    void swim();
}