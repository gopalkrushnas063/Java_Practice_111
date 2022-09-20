package sprint4.day11;

public class _10VarArgs {
    static void print(int i){
        System.out.println(i);
    }
    static void print(int i, int j){
        System.out.println(i+" "+j);
    }

    static void print (Integer...integers){
        for (Integer i : integers
             ) {
            System.out.println(integers+" ");
        }
    }

    public static void main(String[] args) {
        print(1,2);
        print(1);
        print(1,2,3,4);
    }
}
