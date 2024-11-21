public class MixedTypes2DArray {
    public static void main(String[] args) {
        // Declare a 2D array of type Object to hold mixed types
        Object[][] mixedArray = {
            {1, "Hello", 3.14},        // First row: Integer, String, Double
            {"Java", 42, 9.99},        // Second row: String, Integer, Double
            {100, "World", 3.14159}    // Third row: Integer, String, Double
        };

        // Print the elements of the mixed-type 2D array
        System.out.println("All elements of the 2D array with mixed types:");
        for (int i = 0; i < mixedArray.length; i++) {  // Outer loop for rows
            for (int j = 0; j < mixedArray[i].length; j++) {  // Inner loop for columns
                System.out.print(mixedArray[i][j] + "\t");  // Print element at mixedArray[i][j]
            }
            System.out.println();  // Print a new line after each row
        }

        // Accessing specific elements of the mixed-type array
        System.out.println("\nElement at [0][1] (String): " + mixedArray[0][1]);  // Prints "Hello"
        System.out.println("Element at [1][0] (String): " + mixedArray[1][0]);  // Prints "Java"
    }
}
