# HashSet Example in Java

This example demonstrates the usage of the **HashSet** collection in Java to store and manage unique items. `HashSet` is a part of the **Java Collections Framework** and is designed for efficient storage and retrieval of elements without maintaining any specific order.

---

## **Key Features of `HashSet`**
1. **Unique Elements**:
   - A `HashSet` does not allow duplicate elements. If you try to add a duplicate, it will be ignored.
   
2. **No Guaranteed Order**:
   - The elements are not stored in the order they are added. `HashSet` uses hashing to store data, so the order may appear random.

3. **Efficient Operations**:
   - `HashSet` provides constant-time performance for basic operations like `add`, `remove`, and `contains`.

---

## **Code Features**
### Operations Demonstrated in the Example
1. **Adding Elements** (`add(element)`):
   - Adds elements to the `HashSet`.
   - Duplicate elements are not added.
   ```java
   grocerySet.add("Apples");
   grocerySet.add("Apples"); // Duplicate, ignored
```
**Adding Elements** (`contains(element)`):
   - Checks if an element is present in the HashSet.
   ```java
boolean hasBananas = grocerySet.contains("Bananas");
 ```
