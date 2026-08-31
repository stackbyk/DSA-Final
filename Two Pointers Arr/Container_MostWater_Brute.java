import java.util.*;
public class Container_MostWater_Brute {
    public static int maxArea(int[]height){
        int maxArea=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int h=Math.min(height[i],height[j]);
                int width=j-i;
                int area=h*width;
                maxArea=Math.max(maxArea,area);
            }
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int[]height={1,8,6,2,5,4,8,3,7};
        System.out.println("The max area is:"+maxArea(height));
    }
}
