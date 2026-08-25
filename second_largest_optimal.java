import java.util.*;
public class second_largest_optimal {
    public static int secondLargest(int[]arr){
        int largest=Integer.MIN_VALUE;
        int slargest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }else if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr={1,2,7,-7,5,4};
        int result=secondLargest(arr);
        System.out.println("second largest elem is:"+result);
    }
}
