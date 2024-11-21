public class JaggedArrayExample {
    public static void main(String[] args) {
        // Declare and initialize a jagged 2D array (array of arrays)
        int[][] jaggedArray = {
            {1, 2, 3},     // First row (3 columns)
            {4, 5},        // Second row (2 columns)
            {6, 7, 8, 9}   // Third row (4 columns)
        };

        // Print the elements of the jagged array using nested loops
        System.out.println("All elements of the jagged 2D array:");
        for (int i = 0; i < jaggedArray.length; i++) {  // Outer loop for rows
            for (int j = 0; j < jaggedArray[i].length; j++) {  // Inner loop for columns
                System.out.print(jaggedArray[i][j] + "\t");  // Print element at jaggedArray[i][j]
            }
            System.out.println();  // Print a new line after each row
        }
    }
}
