package HomeWork7;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.name = "Jon";
        person1.age = 36;
        person1.gender = "male";

        Person person2 = new Person();
        person2.name = "Anna";
        person2.age = 28;
        person2.gender = "female";

        Person person3 = new Person();
        person3.name = "Bob";
        person3.age = 53;
        person3.gender = "male";

        Person person4 = new Person();
        person4.name = "Jack";
        person4.age = 41;
        person4.gender = "male";

        Person person5 = new Person();
        person5.name = "Sandra";
        person5.age = 25;
        person5.gender = "female";

        Person person6 = new Person();
        person6.name = "Kolya";
        person6.age = 39;
        person6.gender = "male";

        Employee employee1 = new Employee();
        employee1.name = "Sara";
        employee1.age = 24;
        employee1.gender = "female";
        employee1.salary = 1340.0;

        Employee employee2 = new Employee();
        employee2.name = "Milla";
        employee2.gender = "female";
        employee2.age = 34;
        employee2.salary = 1500.0;

        Employee employee3 = new Employee();
        employee3.name = "Jon";
        employee3.gender = "male";
        employee3.age = 34;
        employee3.salary = 1700.0;

        Employee[] employeeArray = new Employee[]{employee1, employee2, employee3};
        Person[] personArray = new Person[]{person1, person2, person3, person4, person5, person6};

        int i;
        for(i = 0; i < personArray.length; ++i) {
            System.out.println(personArray[i].getName());
        }

        for(i = 0; i < employeeArray.length; ++i) {
            System.out.println(employeeArray[i].isSameName(employee3));
        }

        System.out.println(Salary.getSum(employeeArray));
    }
}
