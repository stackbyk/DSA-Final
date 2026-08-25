import java.util.*;
public class s1 {
    public static int smallest(int[]arr){
        Arrays.sort(arr);
        return arr[0];
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,2,3,0,-1};
        int smallest=smallest(arr);
        System.out.println("the sorted array is:"+Arrays.toString(arr));
        System.out.println("The smallest elem is:"+smallest);
    }
}
