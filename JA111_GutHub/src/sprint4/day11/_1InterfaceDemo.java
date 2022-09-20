package sprint4.day11;


interface Shape{

}
//interface (100% abstraction - before Java 8) -> abstract class (partially abstract) ->  concrete class (0% abstraction)
interface MasaiStudentContract{
    // by default all the interface variables are (public static final).
    public static final double fee = 0;
}

class StudentOfMasai implements MasaiStudentContract{
    // a class can implement an interface
}
public class _1InterfaceDemo {
    public static void main(String[] args) {
        StudentOfMasai student = new StudentOfMasai();
        System.out.println(student.fee);
    }
}
