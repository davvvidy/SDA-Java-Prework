public class ExerciseEighth {

    public static void main(String[] args) {

        int i = -20;

        while(i <= 20) {
            System.out.print(i + " ");
            i++;
        }

        i = -20;
        System.out.println();
        while(i <= - 15) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();
        i = 20;
        while(i >= 15) {
            System.out.print(i + " ");
            i--;
        }

        i = -20;
        System.out.println();
        while(i <= 20) {
            if(i != 5) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = -20;
        System.out.println();
        while(i <= 7) {
                System.out.print(i + " ");
            i++;
        }

        i = -20;
        System.out.println();
        while(i <= 20) {
            if(i%3 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        i = -20;
        System.out.println();
        int sum = 0;
        while(i <= 20) {
            sum = sum + i;
            i++;
        }
        System.out.println(sum);

        i = -20;
        while(i <= 20) {
            if(i >= 4) {
                sum = sum + i;
            }
            i++;
        }
        System.out.println(sum);

        i = -20;
        while(i <=20) {
            System.out.print(i + "^2=" + Math.pow(i,2) + " ");
            i++;
        }

        System.out.println();
        i = -20;
        int j = 0;
        while(i <=20) {
            j = i%10;
            System.out.print(i + "%10=" + j + " ");
            i++;
        }
    }
}
