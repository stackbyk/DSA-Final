import java.util.*;
public class MZ1 {
    public static void MoveZeroes(int[]arr){
        int n=arr.length;
        int j=0;
        int temp[]=new int[n];
        
        //Group all non zero elems together
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }

        //Copy back temp arr to origial arr
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[]arr={0,3,0,1,2,0,9,0,7};
        MoveZeroes(arr);
        System.out.println("The new arr is:"+Arrays.toString(arr));
    }
}
