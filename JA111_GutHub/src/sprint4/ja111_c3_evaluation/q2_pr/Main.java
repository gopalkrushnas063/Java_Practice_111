package sprint4.ja111_c3_evaluation.q2_pr;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student strength : ");
        int num = sc.nextInt();
        Student student_arr[] = new Student[num];
        for (int i = 0; i < num ; i++) {
            Student s1 = new Student();
            System.out.print("Enter student name : ");
            s1.setName(sc.next());
            System.out.print("Enter marks : ");
            s1.setMarks(sc.nextInt());


            student_arr[i] = s1;
        }
        int[] scores = new int[student_arr.length];
        for (int i = 0; i < student_arr.length; i++) {
            System.out.println(student_arr[i].toString());
            scores[i]=(student_arr[i].marks);
        }

        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            avg += scores[i];
        }

        System.out.println(Math.abs(avg/num));
    }
}

class Student{
    String name ;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public Student() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String toString(){
        return "Name : "+name + " || marks : "+ marks;
    }
}
