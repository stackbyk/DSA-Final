public class LargestElem_Opt {
    public static int LargestElem(int[]arr){
        int largest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[]arr={1,6,2,10,4,3};
        int largestelem=LargestElem(arr);
        System.out.println("the largest elem is:"+largestelem);
    }
}
