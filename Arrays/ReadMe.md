# Java Array Copy and Alias Examples

This repository demonstrates two important concepts related to arrays in Java:
1. **Copying Arrays**: Using methods like `System.arraycopy` and `Arrays.copyOf`.
2. **Array Aliasing**: Understanding how direct assignment of arrays creates shared references.

---

## Files

### 1. `ArrayCopyExample.java`
This program demonstrates two methods to copy arrays:
- **Partial Copy**: Using `System.arraycopy` to copy specific elements from one array to another.
- **Full Copy**: Using `Arrays.copyOf` to create an exact duplicate of an array.

### 2. `ArrayAliasExample.java`
This program explains array aliasing:
- Assigning one array to another creates a shared reference, meaning changes to one array affect the other.
- Demonstrates how modifying one alias impacts both arrays.

---

## Key Concepts
- **Array Copying**:
  - Use `System.arraycopy` for partial copying of arrays.
  - Use `Arrays.copyOf` for full or resized copies of arrays.

- **Array Aliasing**:
  - Direct assignment between arrays (`array2 = array1`) results in both variables pointing to the same memory, sharing data.

