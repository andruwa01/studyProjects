package lesson15;

public class Test6Lesson15 {
    public static void main(String[] args) {
        int money = 0;
        do {
            System.out.println("Your turn");
            System.out.println("You lose");
            System.out.println(money);
            money -= 10;
        }
        while (money > 50);
    }
}
