public class smallest_optimal {
    public static int smallestElem(int[]arr){
        int smallest=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                smallest=arr[i];
            }
        } //smallest is a local variable so cant be called inside in psvm
        return smallest;
    }
    public static void main(String[] args) {
        int[]arr={7,2,-5,0,3,1,12,4};
        int smallest=smallestElem(arr);
        System.out.println("the smallest elem is:"+smallest);
    }
}
