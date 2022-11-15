package lesson23;

class ParentClass{}
class ChildClass extends ParentClass{}

class Child extends Test23{

    ChildClass classMethod(int age){
        System.out.println("Method via ChildClass");
        this.age = age;
        return new ChildClass();
    }

    int age;
    void testMethod(int age){
        System.out.println("I am test method of child class");
        this.age = age;
    }
    Child(int age){
        this.age = age;
    }
}

public class Test23 {

    ParentClass classMethod(){
        System.out.println("Method via ParentClass");
        return new ParentClass();
    }

    Test23(){
        System.out.println("I am parent class");
    }
    void testMethod(){
        System.out.println("I am test method");
    }
    String name;
    String surname;

    public static void main(String[] args) {
        Test23 test = new Test23();
        Child child = new Child(5);
        System.out.println(child.age);
        test.classMethod();
        child.classMethod(6);
        System.out.println(child.age);
    }
}

