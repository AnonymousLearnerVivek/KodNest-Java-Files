public class Main {
    public static void main(String[] args){

        // Inheritance = One class inherits the attributes and methods
        //               from another class
        //       subclass <- superclass
        //               Child <- Parent
        // Child <- Parent <- Grandparent = Multi-level inheritance
        // Dog, Cat <- Animal, Plant <- Organism

        Dog dog = new Dog();
        Cat cat = new Cat();
        Plant plant = new Plant();

        System.out.println(dog.isAlive);
        System.out.println(cat.isAlive);

        dog.eat();
        cat.eat();
        System.out.println(dog.lives);
        System.out.println(cat.lives);

        dog.speak();
        cat.speak();

        System.out.println(plant.isAlive);
        plant.photosynthesize();
    }
}
