import java.util.*;
public class MoveZeroesBrute {
    public static void MoveZeroes(int[]arr){
        int n=arr.length;
        int[]temp=new int[n]; //create new arr
        int j=0;
        
        // 1.Create a temp arr-> store non zero elems
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j]=arr[i];
                j++; //increment to move on
            }
        }
        // 2.copy temp arr to original arr
        for(int i=0;i<n;i++){
            arr[i]=temp[i];
        }
    }
    public static void main(String[]args){
        int[]arr={0, 1, 0, 3, 12};
        MoveZeroes(arr);
        System.out.println("The new array is:"+Arrays.toString(arr));
    }
}

/*
TC=0(N) -for loop
SC=0(N)- new temp array is created
 */