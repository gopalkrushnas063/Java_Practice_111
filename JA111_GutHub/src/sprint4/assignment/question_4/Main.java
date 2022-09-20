package sprint4.assignment.question_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        Test t=new Test();
        int[] arr= t.display(num);

        int x, y, flg;
        System.out.println("All the Prime numbers within 1 and " + arr[0] + " are:");

        for (x = 1; x <= arr[0]; x++) {
            if (x == 1 || x == 0)
                continue;

            flg = 1;

            for (y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flg = 0;
                    break;
                }
            }


            if (flg == 1)
                System.out.print(x + " ");
        }
    }
}



interface Intr{
    int[] display(int p);
}
class Test implements Intr{


    @Override
    public int[] display(int p) {
        return new int[]{p};
    }
}