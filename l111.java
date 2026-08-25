public class l111 {
    public static void largestElem(int[]arr){
        int largest=arr[0];
        for (int i=1;i<arr.length-1;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("the largest elem is:"+largest);
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,2,3,0,-1};
        largestElem(arr);
    }
}
