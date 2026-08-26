import java.util.*;
public class MZ2 {
    public static void MoveZeroes(int[]arr){
        int n=arr.length;
        int left=0;
        for(int right=0;right<n;right++){
            if(arr[right]!=0){
                int temp=arr[right];
                arr[right]=arr[left];
                arr[left]=temp;
                left++;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={0,2,7,0,1,0,0,0,0,10,5,0,2};
        MoveZeroes(arr);
        System.out.println("The new array is:"+Arrays.toString(arr));
    }
}
