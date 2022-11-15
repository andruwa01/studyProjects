package lesson8;

class Test8 {
    static final float pi = 3.14f;

    static float multiply (float num1, float num2, float num3){
        return num1 * num2 * num3;

    }

    static void divide (float num1, float num2){
        float intPart = num1 / num2;
        float remainder = num1 % num2;
        System.out.println("Integerpart: " + intPart + '\n' + "Remainderpart: " + remainder);
    }

    float squareOfCircle(float R){
        float square = (float) (pi * Math.pow(R, 2));
        return square;
    }

    static float lengthOfCircle(float R){
        float length = 2 * pi * R;
        return length;
    }

    void getInfoAboutR (float R){
        System.out.println("R of circle = " + R);
        System.out.println("Square of circle with current R = " + squareOfCircle(R));
        System.out.println("Length of circle with current R = " + lengthOfCircle(R));
    }

}

public class hometask {
    public static void main(String[] args) {
        Test8.divide(1, 2);
        System.out.println(Test8.multiply(1, 2, 3));

        Test8 circle1 = new Test8();
        System.out.println(circle1.squareOfCircle(5));

        System.out.println(Test8.lengthOfCircle(5));

        Test8 circle2 = new Test8();
        circle2.getInfoAboutR(5);

    }
}
