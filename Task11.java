import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {

        int[] integers = {1, 3, 5, 2, 5, 6, 7, 4, 9, 7};

        for(int i = 0; i < integers.length; i++) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < 6; i++) {
            System.out.print(integers[i] + " ");
        }

        int lengthOfArray = integers.length - 1;
        int sixLastNumbers = lengthOfArray-6;
        System.out.println();
        while(lengthOfArray > sixLastNumbers) {
            System.out.print(integers[lengthOfArray] + " ");
            lengthOfArray--;
        }

        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            if(i%2 == 1) {
                System.out.print(integers[i] + " ");
            }
        }

        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            if(integers[i]%2 == 0) {
                System.out.print(integers[i] + " ");
            }
        }

        System.out.println();
        lengthOfArray = integers.length - 1;
        for(int i = lengthOfArray; i >= 0; i--) {
            System.out.print(integers[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            if(integers[i] != 5) {
                System.out.print(integers[i] + " ");
            }
        }

        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            if(integers[i] <= 7) {
                System.out.print(integers[i] + " ");
            }
        }

        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            if(integers[i]%3 == 0) {
                System.out.print(integers[i] + " ");
            }
        }

        int sum = 0;
        System.out.println();
        for(int i = 0; i < integers.length; i++) {
            sum = sum + integers[i];
        }
        System.out.println(sum);

        sum = 0;
        for(int i = 0; i < integers.length; i++) {
            if(integers[i] >= 4) {
                sum = sum + integers[i];
            }
        }
        System.out.println(sum);

        int maxValue = integers[0];
        int minValue = integers[0];
        for(int i = 0; i < integers.length; i++) {
            if(maxValue < integers[i]) {
                maxValue = integers[i];
            }

            if(minValue > integers[i]) {
                minValue = integers[i];
            }
        }
        System.out.println(minValue + "<-Min Max->" + maxValue);
    }
}
