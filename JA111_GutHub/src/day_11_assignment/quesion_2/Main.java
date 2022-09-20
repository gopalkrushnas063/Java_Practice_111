package day_11_assignment.quesion_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number(1-10)");
        int num = sc.nextInt();


        Parent obj = new Parent(num);
        obj.method1(num);
        obj.method2();
        obj.method3();
        Parent object = new Child(num);
        object.method4();
        object.method1(num);
    }
}


class Parent{

    final int num;

    Parent(int num) {
        this.num = num;
    }

    void method1(int number){
        if(number <= 10 && number >=1) {
            System.out.println("Parent Method 1 : final integer " + number);
        }else{
            System.out.println("Invalid number");
        }
    }
    void method2(){
        System.out.println("Parent Method 2");
    }
    void method3(){
        System.out.println("Parent Method 3");
    }
    void method4(){
        System.out.println("Method 4");
    }

}

class Child extends Parent{

    Child(int num) {
        super(num);
    }

    @Override
    void method1(int number){
        System.out.println("Child Method 1");
    }

    @Override
    void method4(){
        System.out.println("Child Method 4");
    }
}