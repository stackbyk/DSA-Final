public class s11 {
    public static int smallestE(int[]arr){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,2,-3,0,-1};
        int smallest=smallestE(arr);
        System.out.println("the smallest elem is:"+smallest);
    }
}
