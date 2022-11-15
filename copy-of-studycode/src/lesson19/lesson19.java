package lesson19;

public class lesson19 {
    static void sum(int ... a){
        int sum = 0;
        for (int item : a){
            sum += item;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
    }
}
