package sprint4.day13;

import java.io.IOException;
import java.util.Scanner;

public class _1ThrowException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age here : ");
        int num = sc.nextInt();
        try {
            validate(num);
        } catch (IOException e) {
            System.out.println("To cast your age your age should be at least 18");
        }
    }

    static void validate(int age) throws IOException {
        if(age < 18){
            throw new IOException("age < 18");
        }else{
            System.out.println("You can cast your vote.");
        }
    }
}
