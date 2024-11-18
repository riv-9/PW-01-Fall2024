// A class to demonstrate abstract classes, interfaces, and inheritance
public class InheritaceExamples {
    public static void main(String[] args) {
        // Create a Dog object and call its methods
        Dog d = new Dog("H"); // Passes the name "H" to the constructor
        d.move();             // Calls the move method from the Moveable interface
        d.makeSound();        // Calls the makeSound method from the abstract Animal class
    }
}

// Abstract class to represent a general Animal
abstract class Animal {
    String name; // Name of the animal

    // Constructor to initialize the name
    public Animal(String name) {
        this.name = name;
    }

    // Abstract method to define the sound the animal makes
    abstract void makeSound();
}

// Interface to define a moveable behavior
interface Moveable {
    void move(); // Abstract method to be implemented by classes
}

// Concrete class Dog that extends Animal and implements Moveable
class Dog extends Animal implements Moveable {
    // Constructor to initialize the name of the Dog
    public Dog(String name) {
        super(name); // Calls the constructor of the Animal class
    }

    // Implementation of the makeSound method
    void makeSound() {
        System.out.println("Dog makes sound");
    }

    // Implementation of the move method
    public void move() {
        System.out.println("Dog moves");
    }
}
