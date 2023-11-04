public class overriding {
    public static void main(String[] args) {
        children c1 = new children();
        c1.sum();
    }
    
}

class parent{
    void sum (){
        System.out.println("Hello.");   // ignores
    }
}

class children extends parent{
    void sum (){
        System.out.println("Hi.");     // prints
    }
}