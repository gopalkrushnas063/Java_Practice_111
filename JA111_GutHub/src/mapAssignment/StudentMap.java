package mapAssignment;
import java.util.*;

class Student {

    private String name;
    private int marks;

    public Student(String name, Integer marks)
    {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return this.name; }

    public Integer getMarks() { return this.marks; }
    public String toString()
    {
        return this.name + ": " + marks;
    }
}


class AccordingMarks implements Comparator<Student> {
    public int compare(Student s1, Student s2)
    {
        return s1.getMarks().compareTo(s2.getMarks());
    }
}

public class StudentMap {
    public static void main(String[] args)
    {

        TreeMap<Student, String > map
                = new TreeMap<>(new AccordingMarks());

        map.put(new Student("Akshay", 400), "Odisha");
        map.put(new Student("Bina", 500), "Kolkata");
        map.put(new Student("Chintu", 300), "Mumbai");

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
