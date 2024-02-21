package topical.twopoint;

/**
 * @author hff
 * @Description:
 * @date 2023/9/7 11:25
 */
public class MaxArea {

    /**
    *给定一个长度为 n 的整数数组 height 。有 n 条垂线，第 i 条线的两个端点是 (i, 0) 和 (i, height[i]) 。
     * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
     * 返回容器可以储存的最大水量。
     * 说明：你不能倾斜容器。
    * */
    public static int getMaxArea(int[] height) {
        int maxWater = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int tempWater =  (j - i) * Math.min(height[i], height[j]);
                if(tempWater > maxWater){
                    maxWater = tempWater;
                }
            }
        }
        return maxWater;
    }

    public static int getMaxArea_2(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length - 1;
        while(i < j){
            int tempWater = (j - i) * Math.min(height[i], height[j]);
            if(tempWater > maxWater){
                maxWater = tempWater;
            }
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }

        return maxWater;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1,8,6,2,5,4,8,3,7};
        System.out.println(getMaxArea_2(height));
    }
}
