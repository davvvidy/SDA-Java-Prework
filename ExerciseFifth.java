public class ExerciseFifth {

    public static void main(String[] args) {
        byte firstNumber = 6;
        short secondNumber = 13;
        int thirdNumber = 300;
        long fourthNumber = 200;
        float fifthNumber = 5.5F;
        double sixthNumber = 6.54;
        System.out.println(firstNumber+secondNumber);
        System.out.println(fourthNumber-thirdNumber);
        System.out.println(sixthNumber*fifthNumber);
        System.out.println(secondNumber%firstNumber);
        System.out.println(thirdNumber/sixthNumber);

        double arithmeticAverage = (fifthNumber+secondNumber+thirdNumber+fourthNumber+fifthNumber+sixthNumber)/6;
        System.out.println(arithmeticAverage);

        System.out.println(thirdNumber++);
        System.out.println(++thirdNumber);
        System.out.println(thirdNumber--);
        System.out.println(--thirdNumber);

        float firstSide = 6.33F;
        float secondSide = 7.245F;

        float circuitOfRectangle = firstSide*2 + secondSide*2;
        float rectangleBox = firstSide*secondSide;
        System.out.println(circuitOfRectangle);
        System.out.println(rectangleBox);

        double diameterOfACircle = 47.555;
        double circleRadius = diameterOfACircle/2;
        double circumferenceOfACircle = diameterOfACircle*Math.PI;
        double circleField = Math.pow(circleRadius, 2)*Math.PI;
        System.out.println(circumferenceOfACircle);
        System.out.println(circleField);

        double firstTriangleSide = 3;
        double secondTriangleSide = 4;
        double thirdTriangleSide = 5;
        System.out.println(Math.pow(firstTriangleSide, 2) + Math.pow(secondTriangleSide , 2) == Math.pow(thirdTriangleSide, 2));
    }
}
