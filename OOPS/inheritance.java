public class inheritance {
    public static void main(String[] args) {
        Fish tuna = new Fish();
        tuna.eat();
        Dog tuffy = new Dog();
        tuffy.eat();
        tuffy.color = "white";
        System.out.println(tuffy.color);
    }
}

// Base class
class Animal{
    String color;

    void eat(){
        System.out.println("eating.");
    }

    void breathe() {
        System.out.println("Breathing");
    }
}

// derived class    
class Fish extends Animal {
    int fins; 

    void swim(){
        System.out.println("Swims in water.");
    }
}


class Mammals extends Animal{
    int leg;
}

class Dog extends Mammals{
    int breed;
}