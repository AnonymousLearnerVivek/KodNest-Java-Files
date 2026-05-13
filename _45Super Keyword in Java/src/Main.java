public class Main {
    public static void main(String[] args) {

        // super = Refers to the parent class (subclass <- superclass)
        //         Used in constructors and method overriding
        //         Calls the parent constructor to initialize attributes

        Person person = new Person("Tom", "Riddle");
        Student student = new Student("Herry", "Potter", 3.25);
        Employee employee = new Employee("Rubeus", "Hegrid", 50000);
//        person.showName();
//        student.showName();
//
////        System.out.println(student.gpa);
//
//        student.showGPA();
        employee.showSalary();
    }
}
