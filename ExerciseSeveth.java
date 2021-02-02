import java.time.*;

public class ExerciseSeveth {

    public static void main(String[] args) {

        LocalDateTime date = LocalDateTime.now();
        int hours = date.getHour();
        int weekDay = date.getDayOfWeek().getValue();
        int month = date.getMonthValue();
        int monthDay = date.getDayOfMonth();

        if(hours >= 6 && hours <= 10) {
            System.out.println("Jest rano.");
        } else if(hours>10 && hours <= 12) {
            System.out.println("Do południa");
        } else if(hours>12 && hours<=18) {
            System.out.println("Po południu");
        } else if(hours>18 && hours<22) {
            System.out.println("Wieczór");
        } else{
            System.out.println("Noc");
        }

        if(weekDay>=1 && weekDay<=5) {
            System.out.println("Praca");
        } else if(weekDay == 6) {
            System.out.println("Wolne");
        } else {
            System.out.println("Święto");
        }

        if(monthDay>=10 && monthDay<=25) {
            System.out.println("Jest po wypłacie");
        } else {
            System.out.println("Jest przed wypłatą");
        }

        switch(month) {
            case 1:
            case 2:
            case 3:
                System.out.println("Jest zima");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("Jest wiosna");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Jest lato");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Jest jesień");
                break;
            default:
                System.out.println("Błąd");
        }
    }
}
