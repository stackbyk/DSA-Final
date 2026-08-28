import java.util.*;
public class SortColors_Brute{
    public static void sortcolors(int[]arr){
        int countZero=0, countOne=0, countTwo=0;
        int n=arr.length;

        // Count 0s, 1s and 2s
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                countZero++;
            }else if(arr[i]==1){
                countOne++;
            }else{
                countTwo++;
            }
        }

        //replace/override the existing values 
        int i=0;
        while(countZero>0){
            arr[i]=0;
            i++;
            countZero--;
        }
        while(countOne>0){
            arr[i]=1;
            i++;
            countOne--;
        }
        while(countTwo>0){
            arr[i]=2;
            i++;
            countTwo--;
        }
    }
    public static void main(String[] args) {
        int[]arr={1,1,0,2,0,1,0,2,2};
        sortcolors(arr);
        System.out.println("The sorted array is:"+Arrays.toString(arr));
    }
}