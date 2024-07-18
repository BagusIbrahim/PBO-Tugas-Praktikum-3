package sortCollection;

public class Removeood {
    public int[] removeood(int[] arr) {
        int j = 0; // Index for the new array (even numbers)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {  // Check if even number
                arr[j] = arr[i];  // Copy even number to new position
                j++;  // Increment new array index
            } else {
                System.out.println(arr[i]);  // Print removed odd number
            }
        }

        int[] evenArray = new int[j];
        // Copy the even numbers to the new array
        System.arraycopy(arr, 0, evenArray, 0, j);
        System.out.println("Result Array");

        return evenArray;
    }
}