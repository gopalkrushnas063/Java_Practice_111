package sprint4.ja111_c3_evaluation.q1;

public class Loan {
    public double calculateLoanAmount(Employee employeeObj) {
        if (employeeObj instanceof PermanentEmployee) {
            return (double) employeeObj.salary * 0.15;
        } else if (employeeObj instanceof TemporaryEmployee) {
            return (double) employeeObj.salary * 0.1;
        }
        return -1;
    }
}
