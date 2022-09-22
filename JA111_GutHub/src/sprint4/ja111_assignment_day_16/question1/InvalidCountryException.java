package sprint4.ja111_assignment_day_16.question1;

public class InvalidCountryException extends Exception {
    public InvalidCountryException() {
        super();
        System.out.println("InvalidCountryException occurred");
        System.out.println("User Outside India  cannot be registered");
    }
}
