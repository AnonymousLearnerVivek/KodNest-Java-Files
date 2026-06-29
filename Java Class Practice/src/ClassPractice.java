class Brain {
    int IQ;

    public Brain(int IQ) {
        this.IQ = IQ;
    }

    public void brainDetails() {
        System.out.println("IQ is: " + IQ);
    }
}
class Bike {
    int mileage;
    int fuelCapacity;
    public Bike(int mileage, int fuelCapacity) {
        this.mileage = mileage;
        this.fuelCapacity = fuelCapacity;
    }
    public void bikeDetails() {
        System.out.println("Mileage is: " + mileage + " km");
        System.out.println("Fuel Capacity is: " + fuelCapacity + " Liters");
    }
}

class Person11 {
    String name;
    int age;
    Brain brain;
    public Person11(String name, int age, int IQ) {
        this.name = name;
        this.age = age;
        brain = new Brain(IQ);
    }

    public void personDetails() {
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
        brain.brainDetails();
    }

    public void personBikeDetails(Bike bike) {
        bike.bikeDetails();
    }
}
class Student11 extends Person11 {
    int id;
    public Student11(String name, int age,int IQ, int id) {
        super(name, age, IQ);
        this.id = id;
    }
    public void studentDetails() {
        super.personDetails();
        System.out.println("com.Consturctor.Student ID is: " + id);
    }

}
public class ClassPractice {
    public static void main(String[] args) {
        Student11 student = new Student11("Vivek", 22, 142, 11569);
        Bike newBike = new Bike(50, 15);
        newBike.bikeDetails();
        student.studentDetails();
        student.personBikeDetails(newBike);
    }
}
