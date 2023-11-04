public class Interfaces {
    public static void main(String[] args) {
    Queen q = new Queen();           // object
    q.moves();
    bear b = new bear();
    b.grass();
    b.meat();
    }
}

interface ChessPlayer{          // blueprint of class
    void moves();
}

class Queen implements ChessPlayer{       // blueprint of object
    public void moves(){               // use public (cumplosary)
        System.out.println("left, right, up, down, diagonal(in 4 direction)");
    }
}

class King implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down, diagonal(in 1 step)");
    }
}

class Rook implements ChessPlayer{
    public void moves(){
        System.out.println("left, right, up, down");
    }
}

class Pawn implements ChessPlayer{
    public void moves(){
        System.out.println("up, diagonal(only 1 step)");
    }
}



// Multiple inheritance using interface

interface herbivore{
    void grass();
}

interface carnivore{
    void meat();
}

class bear implements herbivore , carnivore{       // using both herbivore as well as carnivore
    public void grass(){
        System.out.println("Eats grass.");
    }
    public void meat(){
        System.out.println("Eats meat.");
    }
}
