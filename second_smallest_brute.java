import java.util.*;
public class second_smallest_brute {
    public static int second_smallest(int[]arr){
        Arrays.sort(arr);
        return arr[1];
    }
    public static void main(String[] args) {
        int[]arr={3,8,7,-7,1,0,2};
        int ssmallest=second_smallest(arr);
        System.out.println("second smallest:"+ssmallest);
    }
}
