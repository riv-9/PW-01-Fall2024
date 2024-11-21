public class ArrayAliasExample {
    public static void main(String[] args) {
        // Create an array and initialize it with values
        int[] array1 = {10, 20, 30}; 
        // array1 now references an array in memory containing {10, 20, 30}

        // Assign array1 to array2 (no new array is created, both refer to the same memory location)
        int[] array2 = array1;

        // Modify an element in array2 (this affects array1 as well, since both refer to the same array)
        array2[1] = 99; // Changing the value at index 1 to 99

        // Print the contents of array1 (it reflects the change made through array2)
        System.out.println("Contents of array1:");
        for (int val : array1) { 
            // Loop through each element of array1 and print
            System.out.print(val + " "); 
        }
        System.out.println(); // Move to the next line after printing array1

        // Print the contents of array2 (it is identical to array1 because they share the same memory reference)
        System.out.println("Contents of array2:");
        for (int val : array2) { 
            // Loop through each element of array2 and print
            System.out.print(val + " "); 
        }
        // No need for a new line here since it's the end of the output
    }
}
