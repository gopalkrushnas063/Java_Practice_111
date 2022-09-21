package sprint4.ja111_c3_evaluation.q1;

public class Main {
    public static void main(String[] args) {
        Loan loan = new Loan();

        Employee emp1 = new PermanentEmployee(1,"Gopal",1000);
        emp1.calculateSalary();

        Employee emp2 = new TemporaryEmployee(1,"Ramesh",20,10);
        emp2.calculateSalary();

        System.out.println(loan.calculateLoanAmount(emp1));
        System.out.println(loan.calculateLoanAmount(emp2));
        System.out.println(loan.calculateLoanAmount(null));
    }


}
abstract class Employee{
    int employeeId;
    String employeeName;
    double salary;

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    public abstract void calculateSalary();
}

