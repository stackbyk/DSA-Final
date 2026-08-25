public class second_largest_better {
    public static int second_largest_elem(int[]arr){
        int n=arr.length;
        int largest=arr[0],slargest=-1;
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        for(int i=1;i<n;i++){
            if(arr[i]>slargest && arr[i]!=largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }
    public static void main(String[] args) {
        int[]arr={1,5,2,7,7,3};
        int result=second_largest_elem(arr);
        System.out.println("the second largest elem:"+result);
    }
}
