package lesson25;

public class Test2 {
    public static void main(String[] args) {
        JumpAble j = new Man();
        Human man = new Man();
        Student student = new Student();
        if (j instanceof JumpAble){
            System.out.println("j is jumpable");
        }
        if (man instanceof Human){
            System.out.println("man is Human");
        }
    }
}

interface JumpAble{}
class Human implements JumpAble{}
class Man extends Human{}
class Student{}
