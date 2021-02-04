public class Task12 {

    public static void main(String[] args) {
        int[] money = {1, 2, 5, 10, 20};
        int sum = 0;
        int idx = (int) (Math.random() * money.length+1);
        int countSteps = 1;
        int sumBefore;
        while(sum != 100) {
            if(idx>=0 && idx<=4) {
                sum += money[idx];
                if(sum > 100) {
                    sum -= money[idx];
                } else if(sum < 100) {
                    sumBefore = sum - money[idx];
                    System.out.print(countSteps + ". " + sumBefore);
                    System.out.println(" + " + money[idx] + " = " + sum);
                    countSteps++;
                }
                if(sum != 100) {
                    idx = (int) (Math.random() * money.length+1);
                } else {
                    sumBefore = sum - money[idx];
                    System.out.print(countSteps + ". " + sumBefore + " + " + money[idx] + " = " + sum);
                }
            } else {
                idx = (int) (Math.random() * money.length+1);
            }
        }
    }
}
