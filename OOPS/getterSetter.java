public class getterSetter {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");     // accessible only using functions
        p1.setTip(5);
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());
    }
}

class Pen{
    private String color;     // not accessible directly 
    private int tip;

    void setColor(String newcolor){
        color = newcolor;            // color = declared color, newcolor = given color in main function  
    }
    void setTip(int tip){
        this.tip = tip;              // for same names use this keyword 
    }

    String getColor(){
        return color;
    }
    int getTip(){
        return this.tip; 
    }
}
