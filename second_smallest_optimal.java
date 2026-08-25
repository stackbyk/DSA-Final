import java.util.*;
public class second_smallest_optimal {
    public static int second_smallest(int[]arr){
        int smallest=Integer.MAX_VALUE,ssmallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            }else if(arr[i]<ssmallest && arr[i]!=smallest){
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
    public static void main(String[] args) {
        int[]arr={1, 5, 2, 7, 7, 3};
        int result=second_smallest(arr);
        System.out.println("second smallest:"+result);
    }
}
