// Represents a general Animal class implementing the AnimalBehavior interface
public class Animal implements AnimalBehavior {

    String type; // Stores the type of the animal (e.g., Cat, Dog)
    static int totalAnimalCount; // Tracks the total number of Animal objects created
    public static final String KINGDOM = "Animalia"; // A constant representing the biological kingdom

    // Constructor to initialize the type of the animal and increment the total count
    public Animal(String type) {
        this.type = type;
        totalAnimalCount++;
    }

    // Getter method to print the type of the animal
    public void getType() {
        System.out.println(type);
    }

    // Overridden eat method from the AnimalBehavior interface
    public void eat() {
        System.out.println("Animal eats");
    }

    // Overridden sound method from the AnimalBehavior interface
    public void sound() {
        System.out.println("Animal makes sound");
    }
}
