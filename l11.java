import java.util.Arrays;

public class l11 {
    public static int largestElem(int[]arr){
        int largest=arr[0];
        Arrays.sort(arr);
        for (int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,2,3,0,-1};
        int largest=largestElem(arr);
        System.out.println("the sorted array is:"+Arrays.toString(arr));
        System.out.println("The largest elem is:"+largest);
    }
}
