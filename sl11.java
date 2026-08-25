public class sl11 {
    public static int second_largest(int[]arr){
        int n=arr.length;
        int largest=arr[0];
        int slargest=-1;
    //first pass-LARGEST
    for(int i=1;i<n;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    //second pass-SECOND LARGEST
    for(int i=1;i<n;i++){
        if(arr[i]>slargest && arr[i]!=largest){
            slargest=arr[i];
        }
    }
    return slargest;
    }
    public static void main(String[] args) {
        int[]arr={1,2,7,7,4,5};
        int result=second_largest(arr);
        System.out.println("second largest elem is:"+result);
    }
}
