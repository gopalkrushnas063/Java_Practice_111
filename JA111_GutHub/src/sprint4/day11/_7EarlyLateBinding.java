package sprint4.day11;

public class _7EarlyLateBinding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.hi();

        Parent p;
        //p = new Child();
        //late binding
        //p.hi();

        EarlyBinding earlyBinding = new EarlyBinding();
        //Early binding
        earlyBinding.hi();
    }
}

class Parent{
    void hi(){
        System.out.println("Hi...17");
    }
}

class Child extends Parent{
    void hi(){
        System.out.println("Hi...22");
    }
}


class EarlyBinding{
    void hi(){
        System.out.println("Hi...Early Binding");
    }
}
