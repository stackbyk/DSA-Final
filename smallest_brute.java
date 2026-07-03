import java.util.*;
public class smallest_brute {
    public static int SmallestElem(int[]nums){
        Arrays.sort(nums);
        return nums[0];
    }
    public static void main(String[] args) {
        int[]nums={11,6,2,5,9,7};
        int smallest=SmallestElem(nums);
        System.out.println("The sorted array is:"+Arrays.toString(nums));
        System.out.println("Smallest elem:"+smallest);
    }
}
