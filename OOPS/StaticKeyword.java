public class StaticKeyword {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Himu";
        s1.roll = 23;
        s1.schoolName = "VMVS";

        Student s2 = new Student();
        System.out.println(s2.schoolName);
        System.out.println(s2.percentage(99, 98,90));
    }
}

class Student{
    String name;
    int roll;
    static String schoolName;

    int percentage(int math, int phy, int che){
        return (math + phy + che)/3;
    }
}
