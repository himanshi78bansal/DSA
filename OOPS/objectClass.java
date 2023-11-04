public class objectClass{
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.color = "Yellow";   // by class name(without calling function)
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);

        Student s1 = new Student();
        s1.calcPerc(99, 98,97);
        System.out.println(s1.percentage);
    }
}

class Pen{   // class name start with Capital letter
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
}

class Student{
    String name;
    int age;
    float percentage;

    void calcPerc(int eng, int math, int science){
        percentage = (eng+math+science)/3;
    }
}