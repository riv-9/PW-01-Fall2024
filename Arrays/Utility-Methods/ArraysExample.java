import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        
        // Example of binarySearch method
        int[] numbers = {1, 3, 5, 7, 9, 11, 13};
        // The array must be sorted for binarySearch to work correctly
        // The method returns the index of the element if found, or a negative value if not found
        int index = Arrays.binarySearch(numbers, 5); // Searching for the number 5
        System.out.println("Index of 5: " + index); // Output: Index of 5: 2
        
        // Example of fill method
        int[] arrayToFill = new int[5];
        // The fill method fills the entire array with the specified value
        Arrays.fill(arrayToFill, 10); // Filling the array with 10
        System.out.println("Array after fill: " + Arrays.toString(arrayToFill)); // Output: Array after fill: [10, 10, 10, 10, 10]
        
        // Example of sort method
        int[] arrayToSort = {5, 3, 9, 1, 7};
        // The sort method sorts the array in ascending order
        Arrays.sort(arrayToSort); // Sorting the array
        System.out.println("Array after sort: " + Arrays.toString(arrayToSort)); // Output: Array after sort: [1, 3, 5, 7, 9]
        
    }
}
