public class ExerciseSecond {

    public static void main(String[] args) {
        Character nameFirstLetter = new Character('P');
        Byte age = new Byte((byte) 24);
        Short year = new Short((short) 2021);
        Float todaysTemperature = new Float((float) 4.3);
        Byte biggerNumber = new Byte((byte) 200);
        System.out.println("My first letter of name is " + nameFirstLetter);
        System.out.println("In " + year + ", I'm " + age + " years old");
        System.out.println("The temperature today is " + todaysTemperature);
        System.out.println("This number will show incorrect: " + biggerNumber);
        System.out.println("My age sqrt = " + Math.sqrt(age));
        System.out.println("Temperature floor = " + Math.floor(todaysTemperature));
    }
}
