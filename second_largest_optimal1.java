import java.util.*;
public class second_largest_optimal1 {
    //first pass-LARGEST
    public static int largest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > largest) {
                largest = x;
            }
        }
        return largest;
    }
    //first pass- SECOND LARGEST

    public static int slargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MIN_VALUE;
        for (int x : arr) {
            if (x > largest) {
                slargest = largest;
                largest = x;
            } 
            else if (x > slargest && x != largest) {
                slargest = x;
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, -7, -5, 4, 0};
        int largest = largest(arr);
        int result = slargest(arr);
        System.out.println("Largest elem is: " + largest);
        System.out.println("Second largest elem is: " + result);
    }
}