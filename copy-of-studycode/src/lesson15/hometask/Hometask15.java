package lesson15.hometask;
// outer inner = while loop
// middle = do while
public class Hometask15 {
    static void getTime(){
        int hour = 0;
        HOUR:
        while (hour < 6){
            int minute = 0;
            MINUTE:
            do {
                if (hour > 1 && minute % 10 == 0){
                    break HOUR;
                }
                int second = 0;
                SECOND:
                while (second < 60){
                    if (second * hour > minute){
                        break SECOND;
                    }
                    System.out.println(hour + ":" + minute + ":" + second);
                    second++;
                }
                minute++;
            }
            while (minute < 60);
            hour++;
        }
    }

    public static void main(String[] args) {
        getTime();
    }
}
