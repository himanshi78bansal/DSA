public class constructorHeirarchy {
    public static void main(String[] args) {
    Mustang m = new Mustang();    // Mustang constructor called
    }
}

class Animal{
    Animal(){
        System.out.println("Animal class constructor");     // first initialize - parent
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse class constructor");      // second initialize - child
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("Mustang class constructor");     // last initialize - subchild
    }
}
