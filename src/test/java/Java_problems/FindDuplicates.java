package Java_problems;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 1, 2, 4, 5};
        System.out.println("Original array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nDuplicates in the array: ");
        findDuplicates(array);
    }

    public static void findDuplicates(int[] array) {
        // Iterate through each element
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                // Compare the current element with the rest of the elements
                if (array[i] == array[j]) {
                    System.out.println(array[i]);
                    break; // Break inner loop to avoid multiple prints of the same duplicate
                }
            }
        }
    }
}
