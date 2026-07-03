import java.util.*;
public class second_largest_brute{
    public static int slargest(int[]arr){
        Arrays.sort(arr);
        int n=arr.length-1;
        int largest=arr[n-1];
        int secondlargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                secondlargest=arr[i];
                break;
            }else{
                secondlargest=-1;
            }
        }
        return secondlargest;
    }
    public static void main(String[] args) {
        int[]arr={9,1,9,4,2,7,3,6,7,1};
       // int slargest=slargest(arr);
        System.out.println("the second largest elem:"+slargest(arr));
    }
}