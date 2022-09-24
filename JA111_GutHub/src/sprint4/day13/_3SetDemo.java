package sprint4.day13;

import java.util.HashSet;
import java.util.Set;

public class _3SetDemo {
    // set Integer : {2,3,4,5}.
        //may or may not be ordered.
        //Doesn't have duplicates.
    //When to use set in Java.
        //if size of the ds is unknown.
        //there are no duplicates.

    public static void main(String[] args) {
        // Default Capacity = 16 items
        // Load factor = .75
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.size();
        set.add(3);
        set.size();set.remove(1);
        System.out.println(set);
        System.out.println("end");

        for (int i = 0; i <15 ; i++) {
            set.add(i);
        }
//        set.forEach(item -> System.out.println(item));
        System.out.println(set);
    }
}
