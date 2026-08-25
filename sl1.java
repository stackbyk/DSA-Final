import java.util.*;
public class sl1{
    public static int second_largest(int[] arr){
        int n=arr.length;
        Arrays.sort(arr); //only after sorting declare largest & slargest
        int largest=arr[n-1];
        int slargest=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=largest){
                slargest=arr[i];
                break;
            }else{
                slargest=-1; //worst case there's no slargest at all
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,-2,3,0,-1};
        int slargestelem=second_largest(arr);
        System.out.println("the second largest elem is:"+slargestelem);
    }
}