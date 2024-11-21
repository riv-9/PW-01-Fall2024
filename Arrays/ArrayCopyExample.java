import java.util.Arrays;

public class ArrayCopyExample {
    public static void main(String[] args) {
        // Source array
        int[] sourceArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Copying a portion of the source array using System.arraycopy
        int[] partialCopy = new int[5]; // Destination array
        System.arraycopy(sourceArray, 2, partialCopy, 0, 5); // Copies elements from index 2 to 6 (5 elements)
        System.out.println("Partial Copy (System.arraycopy): " + Arrays.toString(partialCopy));

        // Copying the entire array using Arrays.copyOf
        int[] fullCopy = Arrays.copyOf(sourceArray, sourceArray.length); // Creates a copy of the entire array
        System.out.println("Full Copy (Arrays.copyOf): " + Arrays.toString(fullCopy));
    }
}
