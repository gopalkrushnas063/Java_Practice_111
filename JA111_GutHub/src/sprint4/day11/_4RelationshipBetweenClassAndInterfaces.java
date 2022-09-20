package sprint4.day11;

public class _4RelationshipBetweenClassAndInterfaces {

    /*
    * class can extend another class (Only one)
    * class interface (any)
    * interface extends interface (any)
    *
    *
    * class A extends B, class C    (multiple inheritance : not supported)
    *
    * */
}


interface AnimalInterface{
    void eat();
}
interface BirdInterface{//} extends AnimalInterface {
    void fly();
}

class Eagle implements BirdInterface , AnimalInterface{

    @Override
    public void eat() {
        System.out.println("Eagle eats");
    }

    @Override
    public void fly() {
        System.out.println("Fly high");
    }
}