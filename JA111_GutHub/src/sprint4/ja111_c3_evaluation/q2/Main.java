package sprint4.ja111_c3_evaluation.q2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student strength : ");
        int n = sc.nextInt();
        Student student_arr[] = new Student[n];
        int total_marks = 0;
        for (int i = 0; i < n ; i++) {
            Student s1 = new Student();
            System.out.print("Enter student name : ");
            String name = sc.next();
            System.out.print("Enter marks : ");
            int marks = sc.nextInt();
            Student st = new Student(name,marks);
            student_arr[i] = st;
            total_marks+=marks;
        }
        for(Student s: student_arr){
            System.out.println(s);
        }

        System.out.println("Average of the student's marks are ; " + (double)total_marks/n);
    }
}

class Student{
    private String name ;
    private int marks;

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

    @Override
    public String toString(){
        return "Name : "+name + " || marks : "+ marks;
    }
}
