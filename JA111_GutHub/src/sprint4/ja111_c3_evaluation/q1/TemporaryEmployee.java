package sprint4.ja111_c3_evaluation.q1;

public class TemporaryEmployee extends Employee {
    private int hoursWorked;
    private int hourlyWage;

    public TemporaryEmployee(int employeeId, String employeeName, int hoursWorked, int hourlyWage) {
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWage = hourlyWage;
    }

    @Override
    public void calculateSalary() {
        salary = hoursWorked * hourlyWage;
    }
}
