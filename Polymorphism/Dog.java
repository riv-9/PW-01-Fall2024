// Represents a specific type of Animal: Dog
public class Dog extends Animal {

    static int count; // Tracks the number of Dog instances created

    // Constructor to initialize a Dog object and increment its count
    public Dog() {
        super("Dog"); // Calls the superclass (Animal) constructor
        count++;
    }

    // Overridden eat method to specify Dog behavior
    public void eat() {
        System.out.println("Dog is eating");
    }
}
