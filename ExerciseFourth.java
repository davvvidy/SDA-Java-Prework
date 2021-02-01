import java.util.Locale;

public class ExerciseFourth {

    public static void main(String[] args) {
        String inscriptionOne = "This is just a first inscription.";
        String inscriptionTwo = "Inscription number two is about ice creams";
        String inscriptionThree = "I'm the last inscription.";
        System.out.println("Chars at 13 position are: " + inscriptionOne.charAt(13) + " " + inscriptionTwo.charAt(13) +
                " " + inscriptionThree.charAt(13));
        System.out.println("Does the string ends with \".\"? 1: " + inscriptionOne.endsWith(".") + " 2: "
                + inscriptionTwo.endsWith(".") + " 3: " + inscriptionThree.endsWith("."));
        System.out.println("Is inscription 1 equal to inscription 2? " + inscriptionOne.equalsIgnoreCase(inscriptionTwo));
        System.out.println("Index of \"t\" text 3: " + inscriptionThree.indexOf("t"));
        System.out.println("Is text two empty? " + inscriptionTwo.isEmpty());
        System.out.println(inscriptionOne.replace("i" ,"w"));
        System.out.println(inscriptionTwo.toLowerCase());
        System.out.println(inscriptionThree.toUpperCase());
        System.out.println(inscriptionOne.trim());

    }
}