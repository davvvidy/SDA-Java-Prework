public class Task13 {

    public static class Person {
        private String name;
        private String surname;
        private char gender;
        private int age;
        private String pesel;

        public Person(String name, String surname, char gender, int age, String pesel) {
            this.name = name;
            this.surname = surname;
            this.gender = gender;
            this.age = age;
            this.pesel = pesel;
        }

        public boolean hasReachedRetirementAge() {
            return (gender == 'F' && age >= 60) || (gender == 'M' && age >= 65);
        }

        public int getAge() {
            return age;
        }

        public int ageDiff(Person p1, Person p2) {
            int result;
            if(p1.age>=p2.age) {
                result = p1.age - p2.age;
            } else {
                result = p2.age - p1.age;
            }
            return result;
        }

        public int yearsToRetirementAge() {
            int result;
            if ((gender == 'F' && age >= 60) || (gender == 'M' && age >= 65)) {
                return 0;
            } else if (gender == 'F') {
                result = 60 - age;
                return result;
            } else {
                result = 65 - age;
                return result;
            }
        }
    }

    public static class PersonApp {
        public static void main(String[] args) {
            Person person1 = new Person("Przemek", "Dy", 'M', 65, "55022615499");
            Person person2 = new Person("Ala", "Py", 'F', 26, "95052342868");
            Person person3 = new Person("Dawid", "Zy", 'M',30 , "91011482651");
            Person person4 = new Person("Katarzyna", "Wu", 'F', 61, "59082014421");

            System.out.println(person1.hasReachedRetirementAge());
            System.out.println(person2.hasReachedRetirementAge());
            System.out.println(person3.hasReachedRetirementAge());
            System.out.println(person4.hasReachedRetirementAge());

            System.out.println(person1.ageDiff(person1, person2));
            System.out.println(person1.ageDiff(person3, person4));

            System.out.println(person1.yearsToRetirementAge());
            System.out.println(person2.yearsToRetirementAge());
            System.out.println(person3.yearsToRetirementAge());
            System.out.println(person4.yearsToRetirementAge());
        }
    }
}
