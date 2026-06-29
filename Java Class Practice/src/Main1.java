public class Main1 {
    public static void main(String[] args){

        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Vivek";
        e1.salary = 50000;

        System.out.println("Employee id: " + e1.id);
        System.out.println("Employee name: " + e1.name);
        System.out.println("Employee salary: " + e1.salary);
        e1.working();
        e1.attendMeeting();

        /*
        Anonymous objects
            An anonymous object in Java does not have a reference name. When you create an anonymous object,
            you instantiate it using the new keyword but you do not assign it to a variable.
            This means that once its immediate use is over,
            you cannot access this object again since there is no reference to it.
         */
        new Employee().working();              // This is an Anonymous object. which will not having any reference and you can use anonymous object for only once like one time use
    }
}
