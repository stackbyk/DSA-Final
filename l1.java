import java.util.*;
public class l1{
    public static int LargestElemm(int []arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[]args){
        int[]arr={11,7,2,4,70,3,6};
        int largest=LargestElemm(arr);
        System.out.println("the sorted array is:"+Arrays.toString(arr));
        System.out.println("The largest no is:"+largest);
    }
}