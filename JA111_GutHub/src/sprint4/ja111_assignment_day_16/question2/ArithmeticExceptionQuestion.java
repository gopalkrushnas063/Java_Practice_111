package sprint4.ja111_assignment_day_16.question2;

import java.util.Scanner;

public class ArithmeticExceptionQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter First Number : ");
            int a = sc.nextInt();
            System.out.print("Enter second number : ");
            int b = sc.nextInt();

            int i =  a / b;
            System.out.println("The Quotient of " +a+" / "+b +" is : " + i);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage() +" caught");
        }finally {
            System.out.println("Inside finally block");
        }
        sc.close();
    }
}
