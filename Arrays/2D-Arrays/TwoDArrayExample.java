public class TwoDArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a 2D array with 3 rows and 4 columns
        int[][] matrix = {
            {1, 2, 3, 4},  // First row (index 0)
            {5, 6, 7, 8},  // Second row (index 1)
            {9, 10, 11, 12} // Third row (index 2)
        };

        // Accessing elements of the 2D array:
        // The syntax is matrix[row][column]

        // Print the element at row 1, column 2 (value 7)
        System.out.println("Element at [1][2]: " + matrix[1][2]);

        // Print all elements of the 2D array using nested loops
        System.out.println("All elements of the 2D array:");
        for (int i = 0; i < matrix.length; i++) {  // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) {  // Inner loop for columns
                System.out.print(matrix[i][j] + "\t");  // Print element at matrix[i][j]
            }
            System.out.println();  // Print a new line after each row
        }

        // Example of modifying an element:
        // Changing the element at row 2, column 1 (from 6 to 99)
        matrix[1][1] = 99;

        // Print the modified 2D array
        System.out.println("\nModified 2D array:");
        for (int i = 0; i < matrix.length; i++) {  // Outer loop for rows
            for (int j = 0; j < matrix[i].length; j++) {  // Inner loop for columns
                System.out.print(matrix[i][j] + "\t");  // Print element at matrix[i][j]
            }
            System.out.println();  // Print a new line after each row
        }
    }
}
