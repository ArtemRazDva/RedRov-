package HomeWork8;


public class Worker extends Person {

    double salary;
//    String getSighn() {
//       System.out.println("Worker has a кекс with Person");
//
//       return null;
//    }
    Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }
    double getSalary() {
        return salary;
    }

}
