import java.time.LocalTime;
import java.util.Scanner;

public class AlarmClock {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set alarm hour (0-23): ");
        int alarmHour = scanner.nextInt();

        System.out.print("Set alarm minute (0-59): ");
        int alarmMinute = scanner.nextInt();

        System.out.println("Alarm set for " + alarmHour + ":" + alarmMinute);

        while (true) {
            LocalTime currentTime = LocalTime.now();

            int currentHour = currentTime.getHour();
            int currentMinute = currentTime.getMinute();

            if (currentHour == alarmHour && currentMinute == alarmMinute) {
                System.out.println("⏰ Alarm! Wake up!");
                break;
            }

            Thread.sleep(1000); // Check every second
        }

        scanner.close();
    }
}
