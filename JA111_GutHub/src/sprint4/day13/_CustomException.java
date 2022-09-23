package sprint4.day13;

import java.util.Scanner;

public class _CustomException {
    public static void main(String[] args) {
        try {
            validateEmail();
        } catch (DuplicateEmailException e) {
            e.printStackTrace();
        }
    }

    static void validateEmail() throws DuplicateEmailException{
        Scanner sc = new Scanner(System.in);
        String[] emails = {"abc@Email.com", "xyz@Email.com" };

        System.out.print("Enter an email : ");
        String email = sc.next();

        for (String e:emails
        ) {
            if(email.equals(e)){
                throw new DuplicateEmailException("Email already exists");
            }
        }
    }

}
class DuplicateEmailException extends Exception{
    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException() {
    }
}