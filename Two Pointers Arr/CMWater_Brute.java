import java.util.*;
public class CMWater_Brute {
    public static int maxArea(int[]height){
        int maxArea=0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int h=Math.min(height[i],height[j]); //min heights b/w bars
                int width=j-i;

                int area=h*width; 
                maxArea=Math.max(maxArea,area); //max area
            }
        }
        return maxArea;
    }
    public static void main(String[]args){
        int[]height={1,8,6,7,2,4,0,3,5};
        System.out.println("The max water stored in the conatiner is:"+maxArea(height));
    }
}
