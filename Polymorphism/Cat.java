// Represents a specific type of Animal: Cat
public class Cat extends Animal {

    static int count; // Tracks the number of Cat instances created

    // Constructor to initialize a Cat object and increment its count
    public Cat() {
        super("Cat"); // Calls the superclass (Animal) constructor
        count++;
    }

    // Overridden eat method to specify Cat behavior
    public void eat() {
        System.out.println("Cat is eating");
    }
}
