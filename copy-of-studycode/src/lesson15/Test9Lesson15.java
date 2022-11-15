package lesson15;

public class Test9Lesson15 {
    public static void main(String[] args) {

        for (int hour = 0; hour < 24; hour++){
            int minute = 0;
            do {
                System.out.println(hour + ":" + minute);
                minute++;
            }
            while (minute < 60);
        }

    }
}
