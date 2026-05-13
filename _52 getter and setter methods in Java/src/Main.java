public class Main {
    public static void main(String[] args){

        // They help protect object data and add rules for accessing or
        // modifying them.
        // GETTERS = Methods that make a field READABLE.
        // SETTERS = Methods that make a field WRITEABLE.

       Car car = new Car("Charger", "Yellow", 10000);

//       car.model = "Corvette"; // it will change Charger to Corvette becuz the model variable is publicly accessible

        car.setColor("Blue");
        car.setPrice(24000);
       System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());
    }
}
