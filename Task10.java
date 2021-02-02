import java.time.*;

public class Task10 {

    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.now();
        DayOfWeek dayOfWeekNotInt = date.getDayOfWeek();
        int dayOfWeek = dayOfWeekNotInt.getValue();
        int dayOfMonth= date.getDayOfMonth();
        System.out.println(dayOfMonth);
        System.out.println("Pn Wt Śr Cz Pt Sb Nd");
        System.out.println("_____________________");
        int i = 1;
        while(i <= dayOfWeek) {
            if(i == dayOfWeek) {
                System.out.print(" 1 ");
            } else {
                System.out.print("   ");
            }
            i++;
        }
        int j = 2;
        while(j <= 31 ) {
            if(j==dayOfMonth) {
                System.out.print("[" + j + "]");
            } else if(j < 10) {
                System.out.print(" " + j + " ");
            } else {
                System.out.print(j + " ");
            }
            if(i == 7) {
                i = 0;
                System.out.println();
            }
            i++;
            j++;
        }
    }
}
