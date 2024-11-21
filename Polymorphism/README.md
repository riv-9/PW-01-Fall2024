# Polymorphism
This folder contains examples and exercises related to polymorphism, including:
- Method overriding
- Interfaces
- Abstract classes

## Files

1. **`Animal.java`**
   - Represents a generic animal implementing the `AnimalBehavior` interface.
   - Contains common fields like `type`, `totalAnimalCount`, and `KINGDOM`.
   - Includes methods like `getType()`, `eat()`, and `sound()` to define general animal behavior.

2. **`AnimalBehavior.java`**
   - An interface defining common behaviors for animals.
   - Includes abstract methods (`eat()` and `sound()`) and a default method (`move()`).

3. **`Cat.java`**
   - Extends the `Animal` class to represent a specific animal type: Cat.
   - Overrides the `eat()` method to customize behavior for cats.
   - Tracks the total number of Cat instances using a static variable.

4. **`Dog.java`**
   - Extends the `Animal` class to represent a specific animal type: Dog.
   - Overrides the `eat()` method to customize behavior for dogs.
   - Tracks the total number of Dog instances using a static variable.

5. **`Main.java`**
   - Contains the main method to demonstrate polymorphism in action.
   - Shows runtime polymorphism using references of type `Animal` pointing to objects of type `Cat` and `Dog`.
   - Prints statistics such as the total number of animals and counts for each type.

## How it Works
- **Polymorphism**:
  - Demonstrated by creating a `Cat` object and referencing it with an `Animal` variable (`Animal c2 = new Cat()`).
  - The `getType()` method dynamically binds to the implementation in the `Cat` class.
- **Inheritance**:
  - Both `Cat` and `Dog` inherit fields and methods from the `Animal` superclass.
- **Static Members**:
  - Tracks total instances of animals and each specific type using static variables.
- **Interfaces**:
  - The `Animal` class implements the `AnimalBehavior` interface to enforce common behaviors across all animals.

## Notes
- This exercise showcases practical usage of Java's object-oriented programming features.
