# Java Collections Framework

This folder contains Java files that demonstrate the use of the **Java Collections Framework** for storing, processing, and managing data efficiently. The examples focus on various collection types, including `HashMap`, `LinkedHashSet`, and `ArrayList`, along with the use of **Streams** and **Lambda Expressions** for concise and functional programming.

---

## **Contents**

### 1. `Main.java`
- Demonstrates the initialization and usage of several collection types in Java:
  - `HashMap`: A key-value mapping structure.
  - `LinkedHashSet`: A set that maintains insertion order.
  - `ArrayList`: A dynamic array allowing duplicates.
- Combines collections to show how data can be processed and interrelated.

---

## **Key Collections and Concepts**

### 1. **`HashMap<Integer, String>`**
- Stores key-value pairs where keys are unique, and each key maps to a single value.
- Demonstrates how to populate and iterate through a `HashMap` using:
  - Traditional iteration.
  - Java Streams and Lambda Expressions.

### 2. **`LinkedHashSet<String>`**
- A set that maintains the order of insertion.
- Demonstrates how duplicates are ignored while maintaining unique values.

### 3. **`ArrayList<Integer>`**
- A dynamic array that allows duplicate values.
- Demonstrates adding integers to the list and printing the elements using streams.

---

## **Operations Demonstrated**

1. **Populating Collections**
   - Adds elements to the `HashMap`, `LinkedHashSet`, and `ArrayList`.
   - Prints the collections using both traditional iteration and Streams.

2. **Combining Collections**
   - Combines elements from the `LinkedHashSet` and `ArrayList` into a `HashMap`:
     - Keys are taken from the `ArrayList`.
     - Values are taken from the `LinkedHashSet`.

3. **Using Streams and Lambda Expressions**
   - Iterates over the collections and prints their elements in a functional style:
     ```java
     o1.intStringMap.entrySet().stream().forEach(entry -> 
         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue()));
     ```

4. **Nested Collections**
   - Stores multiple `HashMap` objects in a `HashSet` and `ArrayList`.
   - Demonstrates how to use collections of collections to manage grouped data.

---

## **How to Run**
1. Compile and run the `Main.java` file.
2. Observe the operations performed on different collections:
   - Adding elements.
   - Iterating over collections.
   - Combining collections.
   - Printing nested collections.

---

## **Learning Outcomes**
By exploring these examples, you will:
- Understand the purpose and use of key collection types like `HashMap`, `LinkedHashSet`, and `ArrayList`.
- Learn how to combine collections to process data.
- Gain hands-on experience with **Streams** and **Lambda Expressions** for concise and efficient operations.

---

## **Example Output**
```plaintext
String Set: [Hello, World, Java, C]
Integer List: [100, 200, 300, 300, 300]
Combined Map (intList -> stringSet):
Key: 100, Value: Hello
Key: 200, Value: World
Key: 300, Value: Java
Maps in the set:
[{100=Hello, 200=World, 300=Java}, {Extra=123}]
