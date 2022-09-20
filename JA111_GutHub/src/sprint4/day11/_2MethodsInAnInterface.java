package sprint4.day11;

interface Animal{
    // by default an interface method is abstract
    void move();
    /* abstract - no details -> overriding
    * final - can't override
    * abstract and final don't go together
    * */
}

abstract class Fish implements Animal{
    // void main() ; will come in here
}


class Dolphin extends Fish{

    @Override
    public void move() {
        System.out.println("Dolphin swim and jump");
    }
}

public class _2MethodsInAnInterface {
    public static void main(String[] args) {
        new Dolphin().move();
        Dolphin dolphin = new Dolphin();
        System.out.println(dolphin instanceof Fish);
    }
}
