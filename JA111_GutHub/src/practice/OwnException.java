package practice;

import java.util.Scanner;

public class OwnException {
    public static void main(String[] args) {
        try {
            validation();
        } catch (MyExceptionHandelProtocol e) {
            e.printStackTrace();
        }
    }

    static void validation() throws MyExceptionHandelProtocol{
        Scanner sc = new Scanner(System.in);
        String[] names = {"gopal","krishna"};
        System.out.println("Enter your name : ");
        String name = sc.next();


        for (String nm:names
             ) {
            if(name.equals(nm))
                throw new MyExceptionHandelProtocol("Name already exists");
        }
    }
}

class MyExceptionHandelProtocol extends Exception{
    public MyExceptionHandelProtocol() {
    }

    public MyExceptionHandelProtocol(String message) {
        super(message);
    }
}
