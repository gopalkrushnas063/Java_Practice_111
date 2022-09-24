package mapAssignment;
import java.util.*;


public class Main {
    public static void main(String[] args)
    {

        TreeMap<Student, String > map
                = new TreeMap<>(new AccordingMarks());

        map.put(new Student("Sambit", 400,17), "Odisha");
        map.put(new Student("Butul", 500,33), "Kolkata");
        map.put(new Student("Gopal", 300,57), "Mumbai");

        System.out.println(
                "TreeMap keys sorting in ascending order of the marks:");

        for (Map.Entry<Student, String > entry :
                map.entrySet()) {
            System.out.println("Key : (" + entry.getKey()
                    + "), Value : "
                    + entry.getValue());
        }
    }
}

class Student {

    private String name;
    private int marks;
    private int roll;

    public Student(String name, Integer marks,Integer roll)
    {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    public String getName() {
        return this.name;
    }

    public Integer getMarks() {
        return this.marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String toString()
    {

        return "Name : "+this.name + " || Marks : " + marks +" || Roll No : "+roll;
    }
}


class AccordingMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {

        return s1.getMarks().compareTo(s2.getMarks());
    }
}

