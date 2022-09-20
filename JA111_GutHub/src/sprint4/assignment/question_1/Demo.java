package sprint4.assignment.question_1;

public class Demo {
    public static void main(String[] args) {
        ZImpl obj = new ZImpl();

        System.out.println("methods of interface X : ");
        obj.abstractMethodX();
        obj.defaultMethodX();
        X.staticMethodX();
        System.out.println(".................................");
        System.out.println("methods of interface Y : ");
        obj.abstractMethodY();
        obj.defaultMethodY();
        Y.staticMethodY();
        System.out.println(".................................");
        System.out.println("methods of interface Z : ");
        obj.abstractMethodZ();

    }
}

interface X{
    abstract void abstractMethodX();
    default void defaultMethodX(){
        System.out.println("Default Method......X");
    }

    static void staticMethodX(){
        System.out.println("Static Method.......X");
    }
}

interface Y{
    abstract void abstractMethodY();
    default void defaultMethodY(){
        System.out.println("Default Method......Y");
    }

    static void staticMethodY(){
        System.out.println("Static Method.......Y");
    }
}

interface Z extends X,Y{
    abstract void abstractMethodZ();
}

class ZImpl implements Z{

    @Override
    public void abstractMethodX() {
        System.out.println("abstract method of x implement in (ZImpl) class");
    }

    @Override
    public void abstractMethodY() {
        System.out.println("abstract method of y implement in (ZImpl) class");

    }

    @Override
    public void abstractMethodZ() {
        System.out.println("abstract method of z implement in (ZImpl) class");

    }
}