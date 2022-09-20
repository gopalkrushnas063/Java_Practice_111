package sprint4.day11;

interface Printer{ // super type
    void print();
}

class FilePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("File Printer");
    }
}
class ConsolePrinter implements Printer{

    @Override
    public void print() {
        System.out.println("Console Printer");
    }
}

public class _3WeProblem {
    //create an interface Printer : print()
    //create a concrete class FilePrinter
    //create a concrete class ConsolePrinter
    public static void main(String[] args) {
        new FilePrinter().print();
        new ConsolePrinter().print();
        FilePrinter filePrinter = new FilePrinter();
        System.out.println(filePrinter instanceof Printer);
    }
}
