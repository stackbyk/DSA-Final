import java.util.*;
public class MoveZeroesOptimal {
     public static void MoveZeroesOpt(int[]arr){
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
        int[]arr={1,0,0,3,2,15};
        MoveZeroesOpt(arr);
        System.out.println("the new array is:"+Arrays.toString(arr));
    }
}
