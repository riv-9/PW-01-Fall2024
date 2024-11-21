# Inheritance in Java

This folder contains Java files that demonstrate **Inheritance**, a core concept of object-oriented programming (OOP) in Java. It also covers the use of **abstract classes** and **interfaces** for extending behavior in a modular and reusable way.

---

## **Contents**

### 1. `InheritanceExample.java`
- Demonstrates how **inheritance** is used to create a hierarchy of related classes.
- Explores how:
  - **Abstract classes** define common behaviors and attributes for subclasses.
  - **Interfaces** add additional behavior (e.g., `move()`).
  - Subclasses override abstract methods to provide their specific implementation.

### **Key Classes and Concepts**
1. **Abstract Class: `Animal`**
   - Represents a generic animal with a `name` field and an abstract method `makeSound()`.
   - Any class extending `Animal` must implement the `makeSound()` method.

2. **Interface: `Moveable`**
   - Defines a behavior (`move()`) that can be implemented by any class.
   - Represents the idea of movement, independent of inheritance hierarchy.

3. **Concrete Class: `Dog`**
   - Extends the abstract `Animal` class and implements the `Moveable` interface.
   - Implements both the `makeSound()` method (from `Animal`) and the `move()` method (from `Moveable`).

### **Example Code**
```java
Dog d = new Dog("H");  // Creates a Dog object with the name "H"
d.move();              // Outputs "Dog moves"
d.makeSound();         // Outputs "Dog makes sound"
