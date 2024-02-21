package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 */
public class TrapWater {
    /**                 *****
     * https://leetcode.cn/problems/trapping-rain-water/?envType=study-plan-v2&envId=top-interview-150
     * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
     * 输入：height = [0,1,0,2,1,0,1,3,2,1,2,1]
     * 输出：6
     * 解释：上面是由数组 [0,1,0,2,1,0,1,3,2,1,2,1] 表示的高度图，在这种情况下，可以接 6 个单位的雨水（蓝色部分表示雨水）。
     *
     * 按行计算
     */
    public static int trap(int[] height) {
        int ret = 0;
        int maxHeight = getHeight(height);
        for (int j = 0; j <= maxHeight; j++) {
            int temp = 0;
            boolean flag = false;
            for (int i = 0; i < height.length; i++) {
                if (flag && height[i] < j) {
                    temp++;
                }
                if (height[i] >= j) {
                    flag = true;
                    ret = ret + temp;
                    temp = 0;
                }

            }
        }
        return ret;
    }

    public static int getHeight(int[] height) {
        int h = 0;
        for (int i = 0; i < height.length; i++) {
            h = Math.max(h, height[i]);
        }
        return h;
    }

    /**按列计算
    *
    * */
    public static int trap2(int[] height) {
        int sum = 0;
        for (int i = 1; i < height.length - 1; i++) {

            //找i左侧的最大值
            int maxLeft = 0;
            for (int j = 0; j < i ; j++) {
                if(height[j] >maxLeft){
                    maxLeft = height[j];
                };
            }
            //找i右侧的最大值
            int maxRight = 0;
            for (int j = i + 1; j < height.length; j++) {
                if(height[j] > maxRight){
                    maxRight = height[j];
                }
            }
            int min = Math.min(maxLeft, maxRight);
            if(min > height[i]){
                sum += (min-height[i]);
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        //int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] height = {4,2,0,3,2,5};
        int trap = trap2(height);
        System.out.println(trap);
    }
}
