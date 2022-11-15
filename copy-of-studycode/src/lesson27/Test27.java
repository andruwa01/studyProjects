package lesson27;

public class Test27 {
    public static void main(String[] args) {
        int[] array = {4, 8, 1};
        System.out.println("We have an array");
        try {
            System.out.println(array[6]);
            System.out.println("Have a nice day");
        } catch (IndexOutOfBoundsException e){
            System.out.println("Exception was catch");
        }
        finally {
            System.out.println("this is finally block");
        }
        System.out.println("this code doesnt not have any sense to exception");
    }
}