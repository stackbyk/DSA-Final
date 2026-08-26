import java.util.*;
public class TwoSum_Brute {
    public static int[] TwoSum(int[]arr,int target){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("Numbers are: " + arr[i] + " and " + arr[j]);
                    return new int[]{i+1,j+1};
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int[]arr={1,2,7,3,9};
        int target=9;
        System.out.println("Indexes of two sum is:"+Arrays.toString(TwoSum(arr,target)));
    }
}
