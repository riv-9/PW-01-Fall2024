// Main class to demonstrate polymorphism and object interaction
public class Main {
    public static void main(String[] args) {

        // Create instances of Cat, Animal, and Dog
        Cat c1 = new Cat();
        Animal a1 = new Animal("general");
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        // Demonstrate method calls and polymorphic behavior
        a1.getType(); // Prints the type of the general Animal
        c1.getType(); // Prints the type of the Cat

        Animal c2 = new Cat(); // Polymorphism: Cat object referenced as an Animal
        c2.getType(); // Prints "Cat" (runtime polymorphism)

        // Print statistics about the Animal class and subclasses
        System.out.println(Animal.totalAnimalCount); // Total number of animals created
        System.out.println(Cat.count); // Number of Cat instances
        System.out.println(Cat.KINGDOM); // Biological kingdom constant
        System.out.println(Dog.count); // Number of Dog instances

        // Demonstrate overridden methods
        d1.eat(); // Dog's implementation of the eat method
    }
}
