public class ExerciseThird {

    public static void main(String[] args) {
    String name = "Przemek";
    String horizontalLine = "##########################";
    char verticalLine = '|';
    char corner = '+';
    String surname = "Dyy";
    String street = "Jagodowa";
    short streetNumber = 23;
    String postcode = "00-300 Warszawa";
    int phoneNumber = 715322543;
    String code = "+48";
    System.out.println(corner + horizontalLine + corner);
    System.out.println(verticalLine + "                          " + verticalLine);
    System.out.println(verticalLine + "        " + name + " " + surname + "       " + verticalLine);
    System.out.println(verticalLine + "      ul." + street + " " + streetNumber + "      " + verticalLine);
    System.out.println(verticalLine + "     " + postcode + "      " + verticalLine);
    System.out.println(verticalLine + "      " + code + " "+ phoneNumber + "       " + verticalLine);
    System.out.println(verticalLine + "                          " + verticalLine);
    System.out.println(corner + horizontalLine + corner);
    }
}
