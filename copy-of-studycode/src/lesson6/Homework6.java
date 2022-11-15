package lesson6;

class overloadedsum {

    int sum(){
        return 0;
    }

    int sum(int num0){
        return num0;
    }

    int sum(int num0, int num1){
        return num0 + num1;
    }

    int sum(int num0, int num1, int num2){
        return num0 + num1 + num2;
    }

    int sum(int num0, int num1, int num2, int num3){
        return num0 + num1 + num2 + num3;
    }

}

public class Homework6 {
    public static void main(String[] args) {
        overloadedsum sum1 = new overloadedsum();
        System.out.println(sum1.sum(1, 2, 3));
    }
}
