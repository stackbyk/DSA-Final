import java.util.*;
class LargestElem_Brute{
    public static int LargestElem(int[] arr){
        //Sort the array
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
    public static void main(String[]args){
        int[] arr={1,6,2,4,8,3,0};
        int largest=LargestElem(arr);
        System.out.println("The sorted array is:"+ Arrays.toString(arr));
        System.out.println("The largest element is:"+largest);
    }
}