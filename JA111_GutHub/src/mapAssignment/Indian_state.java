package mapAssignment;

import java.util.*;

public class Indian_state {
    public static void main(String[] args) {
        Map<String ,String> indiaState = new HashMap<>();

        indiaState.put("Odisha","Bhubaneswar");
        indiaState.put("Assam","Dispur");
        indiaState.put("Mumbai","Maharastra");
        indiaState.put("Bihar","Patna");
        indiaState.put("Chandigarh","Punjab");


        System.out.println("State -> Capital");
        indiaState.forEach((k,v)-> System.out.println(k+"->"+v));

    }
}
