public class Task15 {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int number;
        int countLine = 0;
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("+----+----+----+----+----+----+----+----+----+----+");
            for(int j = 0; j <numbers.length; j++) {
                number = numbers[i] * numbers[j];
                if(countLine == 0) {
                    System.out.print("|");
                }
                System.out.print(String.format("%3s", number) + " |");
                countLine++;
                if(countLine == 10) {
                    System.out.println();
                    countLine = 0;
                }
            }
        }
        System.out.println("+----+----+----+----+----+----+----+----+----+----+");
    }
}
