public class second_smallest_better {
    public static int second_smallest_elem(int[] arr) {
        int n = arr.length;
        int smallest = arr[0], ssmallest = Integer.MAX_VALUE;
        // First pass - find smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        // Second pass - find second smallest
        for (int i = 1; i < n; i++) {
            if (arr[i] < ssmallest && arr[i] != smallest) {
                ssmallest = arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[] arr = {-1, 5, -2, 7, 7, 3};
        int result = second_smallest_elem(arr);
        System.out.println("The second smallest elem: " + result);
    }
}