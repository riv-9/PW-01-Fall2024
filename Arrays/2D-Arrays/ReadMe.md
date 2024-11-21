# Java 2D Array Examples

This repository demonstrates three types of 2D arrays in Java:
1. **Standard 2D Arrays**: Fixed-size rows and columns.
2. **Jagged Arrays**: Variable-size rows (array of arrays).
3. **Mixed-Type 2D Arrays**: Using `Object[][]` to store elements of different types.

---

## Files and Descriptions

### 1. `TwoDArrayExample.java`
- Demonstrates basic operations with a standard 2D array.
- **Features**:
  - Declaring and initializing a 2D array.
  - Accessing elements using row and column indices.
  - Iterating over the array using nested loops.
  - Modifying specific elements in the array.
- **Sample Output**:
```
  Element at [1][2]: 7 All elements of the 2D array: 1 2 3 4 5 6 7 8 9 10 11 12
  Modified 2D array: 1 2 3 4 5 99 7 8 9 10 11 12
```


### 2. `JaggedArrayExample.java`
- Demonstrates the use of jagged arrays (arrays with rows of varying lengths).
- **Features**:
- Declaring and initializing a jagged 2D array.
- Printing elements of the jagged array using nested loops.
- **Sample Output**:
```
  All elements of the jagged 2D array: 1 2 3 4 5 6 7 8 9
```


### 3. `MixedTypes2DArray.java`
- Demonstrates a 2D array storing mixed types using `Object[][]`.
- **Features**:
- Declaring and initializing a 2D array with mixed data types (Integer, String, Double).
- Accessing and printing elements of the array.
- Printing specific elements by their indices.
- **Sample Output**:
```
All elements of the 2D array with mixed types: 1 Hello 3.14 Java 42 9.99 100 World 3.14159
Element at [0][1] (String): Hello Element at [1][0] (String): Java
```
