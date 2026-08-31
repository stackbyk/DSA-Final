import java.util.*;
public class Container_MostWater_Optimal {
    public static int maxArea(int[]height){
        int maxArea=0;
        int n=height.length;
        int left=0,right=n-1;

        while(left<=right){
            int h=Math.min(height[left],height[right]);
            int w=right-left;
            int area=h*w;
            maxArea=Math.max(maxArea,area);

            if(height[left]<=right){
                left++;
            }else{
                right--;
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[]height={1,8,2,4,5,0,2,8,9,2,4,3,7};
        System.out.println("Max water stored in the container is:"+maxArea(height));
    }
}
