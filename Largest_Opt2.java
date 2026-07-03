public class Largest_Opt2 {
    public static void LargestElem(int[]arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("The largest elem is:"+largest);
    }
    public static void main(String[] args) {
        int[]arr={1,5,2,8,0,3};
        LargestElem(arr);
    }
}
