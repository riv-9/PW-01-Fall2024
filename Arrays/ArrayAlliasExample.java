public class ArrayAliasExample {
    public static void main(String[] args) {
        // Create an array
        int[] array1 = {10, 20, 30};

        // Directly assign array1 to array2
        int[] array2 = array1;

        // Modify an element in array2
        array2[1] = 99;

        // Print both arrays
        System.out.println("Contents of array1:");
        for (int val : array1) {
            System.out.print(val + " ");
        }
        System.out.println();

        System.out.println("Contents of array2:");
        for (int val : array2) {
            System.out.print(val + " ");
        }
    }
}
