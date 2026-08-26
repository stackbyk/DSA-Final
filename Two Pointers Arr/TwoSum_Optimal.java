import java.util.*;
public class TwoSum_Optimal {
    public static int[] twoSum(int[]arr, int target){
        int n=arr.length;
        int left=0,right=n-1;
        while(left<right){
            int sum=arr[left]+arr[right];
            if(sum==target){
                System.out.println("The numbers are:"+arr[left]+"&"+arr[right]);
                return new int[] {left+1,right+1};
                
            }else if(sum>target){
                right--;
            }else{
                left++;
            }
        }
        return new int[]{-1, -1};
    }
    public static void main(String[]args){
        int[]arr= {2, 7, 11, 15};
        int target=9;
        System.out.println("The Two sum array is:"+Arrays.toString(twoSum(arr, target)));
    }
}
