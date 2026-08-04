import java.util.Scanner;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an array
        int[] arr = new int[5];

        // Input elements using for loop
        System.out.println("Enter 5 elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Display using for loop
        System.out.println("\nUsing for loop:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        // Display using for-each loop
        System.out.println("\n\nUsing for-each loop:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        // Access an element
        System.out.println("\n\nThird element: " + arr[2]);

        // Modify an element
        arr[1] = 100;
        System.out.println("After modifying second element:");
        System.out.println(Arrays.toString(arr));

        // Sort the array
        Arrays.sort(arr);
        System.out.println("Sorted array:");
        System.out.println(Arrays.toString(arr));

        // Length of array
        System.out.println("Array Length: " + arr.length);

        sc.close();
    }
}
