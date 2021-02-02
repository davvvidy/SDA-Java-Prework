public class ExerciseSixth {

    public static void main(String[] args) {
        int result = (int) (Math.random() * 6 + 1);

        switch(result) {
            case 1:
            case 3:
            case 5:
                System.out.println("Wyrzucona cyfra jest nieparzysta");
                break;
            case 2:
            case 4:
            case 6:
                System.out.println("Wyrzucona cyfra jest parzysta");
                break;
            default:
                System.out.println("Błąd");
        }
        if (result == 6)
            System.out.println("WYGRAŁEŚ");
    }
}
