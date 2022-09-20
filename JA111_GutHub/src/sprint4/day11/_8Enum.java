package sprint4.day11;

public class _8Enum {
    public static void main(String[] args) {
        Direction direction;
        direction = Direction.EAST;
        Direction direction1 = Direction.WEST;
        System.out.println(direction1 == direction);
        System.out.println(direction1 == Direction.WEST);
    }
}

enum Direction{
    EAST,WEST,NORTH,SOUTH
}


enum Color{
    RED,
    GREEN,
    BLUE;
}