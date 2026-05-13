public class Student extends Person{
    double gpa;

    // this -> refers to the object you are working with
    // super -> refers to the parent class of the object you are working with

    Student(String first, String last, double gpa) {
//        this.first = first; we cannot use this here
//        this.last = last;
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + "'s gpa is: " + this.gpa);
    }

}
