public class constructor {
    public static void main(String[] args) {
        Student s1 = new Student();  // Calling non-parameterized constructor

        Student s2 = new Student("Himu", 23);   // Calling parameterized constructor
        s2.marks[0] = 100;   
        s2.marks[1] = 90;   
        s2.marks[2] = 80;   

        Student s3 = new Student(s2);  // calling copy constructor
        s2.marks[2] = 100; 
        
        for(int i = 0; i < 3; i++){
            System.out.println(s3.marks[i]);
        }
    }
}

class Student{
    String name;
    int age;
    int marks[];

    Student(){       // Non-parameterized Constructor
        System.out.println("Constructor called...");
    }

    Student(String name, int age){     
        marks = new int[3];   // Parameterized Constructor
        this.name = name;
        this.age = age;
    }
    

    // shallow copy contructor
    // Student(Student s2){
    //     marks = new int [3];
    //     this.name = s2.name;
    //     this.age = s2.age;
    //     this.marks = s2.marks;
    // }

    // deep copy
    Student(Student s2){
        marks = new int[3];
        this.name = s2.name;
        this.age = s2.age;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s2.marks[i];
        }
    }
}
