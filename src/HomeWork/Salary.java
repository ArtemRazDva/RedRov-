package HomeWork;

public class Salary {
    static double getSum(Employee[] employeeArray) {
        double sum = 0.0;

        for(int i = 0; i < employeeArray.length; ++i) {
            sum += employeeArray[i].salary;
        }

        return sum;
    }
}
