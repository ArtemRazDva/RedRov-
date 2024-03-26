package HomeWork7;

public class Person {
    String name;
    String gender;
    int age;

    String getName() {

        if (gender.equals("male")) {
            return "Mr " + name;
        }
        return "Mrs " + name;
    }
}
