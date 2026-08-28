import java.util.*;
public class SortColors_Dutch_Flag {
    public static void Dutch_National_Flag(int[]arr){
        int n=arr.length;
        int low=0,mid=0,high=n-1;
        while(mid<=high){
            if(arr[mid]==0){
                int temp=arr[low];
                arr[low]=arr[mid];
                arr[mid]=temp;
                low++;
                mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={1, 1, 0, 2, 0, 1, 0, 2, 2};
        Dutch_National_Flag(arr);
        System.out.println("Sorted array is:"+Arrays.toString(arr));
    }
}
