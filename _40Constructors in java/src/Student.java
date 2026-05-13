public class Student {

    String name = "Spongebob";
    int age;
    double gpa;
    boolean isEnrolled;

    Student(String name, int age, double gpa) { // here parameters name can be anything
        this.name = name;
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;

    }

    void study(){
        System.out.println(this.name + " is studying");
    }
}
