package sprint4.ja111_c3_evaluation.q1;

public class PermanentEmployee extends Employee {
    private double basicPay;

    public PermanentEmployee(int employeeId, String employeeName, double basicPay) {
        super(employeeId, employeeName);
        this.basicPay = basicPay;
    }


    @Override
    public void calculateSalary() {
        salary = basicPay - basicPay * 0.12;
    }
}
