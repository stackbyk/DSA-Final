public class s111 {
    public static void smallestE(int[]arr){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        }
        System.out.println("the smallest elem is:"+smallest);
    }
    public static void main(String[] args) {
        int[]arr={4,6,5,7,-2,3,0,-1};
        smallestE(arr);
    }
}
