import java.time.*;

public class Task9 {
    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        int hours = date.getHour();
        int minutes = date.getMinute();
        int seconds = date.getSecond();

        System.out.println("Aktualny czas: " + hours + ":" + minutes + ":" + seconds);

        int i = 1;
        int counter = 0;
        System.out.println("Godzina:");
        while(i <= hours) {
            System.out.print("*");
            i++;
            counter++;
            if(counter == 10) {
                counter = 0;
                System.out.println();
            }
        }

        System.out.println();
        i = 1;
        counter = 0;
        System.out.println("Minuty:");
        while(i <= minutes) {
            System.out.print("*");
            i++;
            counter++;
            if(counter == 10) {
                counter = 0;
                System.out.println();
            }
        }

        System.out.println();
        i = 1;
        counter = 0;
        System.out.println("Sekundy:");
        while(i <= seconds) {
            System.out.print("*");
            i++;
            counter++;
            if(counter == 10) {
                counter = 0;
                System.out.println();
            }
        }
    }
}
