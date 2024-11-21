# Java Arrays Utility Class Examples

This program demonstrates three key methods from the `java.util.Arrays` class:
- `binarySearch()`
- `fill()`
- `sort()`

---

## Features

### 1. **Binary Search**
- **Method**: `Arrays.binarySearch(array, key)`
- **Description**: Searches for a key in a sorted array. Returns the index if the key is found, otherwise a negative value.
- **Example**:
  ```java
  int[] numbers = {1, 3, 5, 7, 9, 11, 13};
  int index = Arrays.binarySearch(numbers, 5);
  System.out.println("Index of 5: " + index); // Output: Index of 5: 2
  ```
### 2. **Fill**
- **Method**: `Arrays.fill(array, value)`
- **Description**: Fills an array with the specified value.
- **Example**:
  ```java
  int[] arrayToFill = new int[5];
  Arrays.fill(arrayToFill, 10);
System.out.println(Arrays.toString(arrayToFill)); // Output: [10, 10, 10, 10, 10]
  ```
  
### 1. **Binary Search**
- **Method**: `Arrays.binarySearch(array, key)`
- **Description**: Searches for a key in a sorted array. Returns the index if the key is found, otherwise a negative value.
- **Example**:
  ```java
  int[] numbers = {1, 3, 5, 7, 9, 11, 13};
  int index = Arrays.binarySearch(numbers, 5);
  System.out.println("Index of 5: " + index); // Output: Index of 5: 2
  ```
```
