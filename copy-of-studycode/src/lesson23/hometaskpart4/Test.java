package lesson23.hometaskpart4;

class X{}
class Y extends X{}

public class Test {
    public static void abc(X x, Y y){
        System.out.println("Hello");
    }
    public static void abc(Y y, X x){
        System.out.println("Bye");
    }

    public static void main(String[] args) {
        Y a = new Y();
        abc((X) a, a);
    }
}
