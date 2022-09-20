package sprint4.day11;

public class _6DefaultMethod {
    public static void main(String[] args) {
        Food dosa = new Dosa();
        dosa.dineIn();
        dosa.deliver();

        Idli idli = new Idli();
        idli.deliver();
        Food.eat();
    }
}

interface Food{
//    void concreateMethod(){}
    void dineIn();
    default void deliver(){
        System.out.println("Delivering Food");
    }
    static void eat(){
        System.out.println("Eat Food");
    }
}
// if you add new method in an interface
// the implementation will break
// backward incompatibility
class Dosa implements Food{

    @Override
    public void dineIn() {
        System.out.println("Serving Dosa....");
    }
}

class Idli implements Food{

    @Override
    public void dineIn() {
        System.out.println("Serving Idli....");
    }
}