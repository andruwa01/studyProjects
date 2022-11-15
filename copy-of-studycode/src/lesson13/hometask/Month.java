package lesson13.hometask;

public class Month {
    static void showDaysInCurrentMonth(byte num){
        switch (num){
            case 1:
            case 5:
            case 7:
            case 10:
            case 12:
                System.out.println(31);
                break;
            case 4:
            case 6:
            case 8:
            case 9:
                System.out.println(30);
                break;
            case 3:
            case 11:
                System.out.println(29);
                break;
            case 2:
                System.out.println(28);
                break;
            default:
                System.out.println("Incorrect num");
        }
    }

    public static void main(String[] args) {
        showDaysInCurrentMonth((byte) 3);
    }
}
