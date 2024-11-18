// Interface defining common behaviors for all animals
public interface AnimalBehavior {

    int MAX_AGE = 100; // Maximum age for an animal (a constant)

    // Abstract method to be implemented by classes
    void eat();

    // Default method for movement, which can be overridden
    default void move() {
        System.out.println("It moves");
    }

    // Abstract method to define animal sounds
    void sound();
}
