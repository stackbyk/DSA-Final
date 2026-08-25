import java.util.*;
public class MZBrute {
    public static void MoveZeroes(int[]arr){
        int n=arr.length;
        int[]temp=new int[n]; //by default java gives the value to empty arr as 0's 
        int j=0;

        //1.Group non zero elems
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++;
            }
        }
        //2.copy temp to original arr
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[] args) {
        int[]arr={1, 3, 12, 0, 0};
        MoveZeroes(arr);
        System.out.println("The new array is:"+Arrays.toString(arr));
    }
}
