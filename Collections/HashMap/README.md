# HashMap Phonebook Example

This example demonstrates how to use the **HashMap** in Java to create a simple phonebook. It also showcases how to leverage **Java Streams** and **Lambda Expressions** to process keys, values, and entries in a functional programming style.

---

## **Features**
1. **Basic HashMap Operations**:
   - Adding key-value pairs (`put`).
   - Retrieving values by key (`get`).
   - Checking existence of keys or values (`containsKey`, `containsValue`).
   - Removing entries (`remove`).
   - Retrieving all keys (`keySet`) and values (`values`).
   - Getting the size of the map (`size`).
   - Clearing all entries (`clear`).

2. **Using Java Streams with HashMap**:
   - Iterating over keys, values, and entries.
   - Filtering entries based on specific conditions.
   - Collecting results into lists or new maps.

---

## **Code Highlights**

### Basic HashMap Operations
- Adding entries:
  ```java
  phonebook.put("Alice", "123-456-7890");
  phonebook.put("Bob", "987-654-3210");

### Values
```java
String bobNumber = phonebook.get("Bob");
```
Checking for Keys
```java
boolean hasAlice = phonebook.containsKey("Alice");
```
Using Streams
Streaming Keys
```java
phonebook.keySet().stream()
        .forEach(key -> System.out.println("Key: " + key));
```
Filtering Entries
```java
phonebook.entrySet().stream()
        .filter(entry -> entry.getKey().startsWith("A"))
        .forEach(entry -> System.out.println("Filtered Entry: " + entry.getKey()
```
