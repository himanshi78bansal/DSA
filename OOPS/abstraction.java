public class abstraction {
    public static void main(String[] args) {
    Horse h = new Horse();
    h.eat();
    h.walks();    // calling
    Chicken c = new Chicken();
    c.eat();
    c.walks();     // calling
    // Animal a = new Animal();      // cannot make object of any abstracted class.
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal class constructor");    // Can make a constructor in abstracted class
    }
    void eat(){
        System.out.println("Animal eats.");
    }
    abstract void walks();     // only idea, No implementation
}

class Horse extends Animal{
    void walks(){             // Implementation
        System.out.println("walks on snow.");
    }
}

class Chicken extends Animal{
    void walks(){         // Implementation
        System.out.println("walks on surface.");
    }
}