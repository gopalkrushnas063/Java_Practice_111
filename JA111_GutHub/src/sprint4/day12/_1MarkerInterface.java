package sprint4.day12;

import java.io.Serializable;

public class _1MarkerInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
    }
}
interface MyMarkerInterface{

}
class MyClass implements Serializable,Cloneable {// tag : Serializable,Cloneable
    int i;
}