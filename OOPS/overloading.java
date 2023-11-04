// method overloading

public class overloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(5,2));
        System.out.println(c1.sum((float)2.4,(float)5.8));
        System.out.println(c1.sum(4, 7, 9));
    }
}


class Calculator{
    int sum(int a, int b){
        return(a+b);
    }
    
    float sum(float a, float b){
        return(a+b);
    }
    
    int sum(int a, int b, int c){
        return(a+b+c);
    }
}



