package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 * @date 2023/8/28 15:24
 */
public class Candy {

    /**https://leetcode.cn/problems/candy/description/?envType=study-plan-v2&envId=top-interview-150
    *n 个孩子站成一排。给你一个整数数组 ratings 表示每个孩子的评分。
     * 你需要按照以下要求，给这些孩子分发糖果：
     * 每个孩子至少分配到 1 个糖果。
     * 相邻两个孩子评分更高的孩子会获得更多的糖果。
     * 请你给每个孩子分发糖果，计算并返回需要准备的 最少糖果数目 。
    * */
    public static int candy(int[] ratings) {
        int length = ratings.length;
        if(length == 0){
            return 0;
        }
        int[] candyCounts = new int[length];
        int count = 1;
        candyCounts[0] = 1;
        for (int i = 1; i < length; i++) {
            if(ratings[i ] > ratings[i - 1]){
                candyCounts[i] = ++count;
            }else{
                count = 1;
                candyCounts[i] = 1;
            }
        }

        int right = 0;
        int ret = 0;
        for (int i = length - 1; i >= 0 ; i--) {
            if(i < length - 1 && ratings[i] > ratings[i+1]){
                right++;
            }else {
                right = 1;
            }
            ret += Math.max(candyCounts[i], right);
        }

        return ret;
    }

    /*
    * 返回每个孩子的糖果数量
    * */
    public static int candy2(int[] ratings) {
        int length = ratings.length;
        if(length == 0){
            return 0;
        }
        int[] candyCounts = new int[length];
        int count = 1;
        candyCounts[0] = 1;
        for (int i = 1; i < length; i++) {
            if(ratings[i ] > ratings[i - 1]){
                candyCounts[i] = ++count;
            }else{
                count = 1;
                candyCounts[i] = 1;
            }
        }

        int r = 0;
        int ret = 0;
        int[] candyCounts3 = new int[length];
        for (int i = length - 1; i >= 0; i--) {
            if(i < length - 1 && ratings[i] > ratings[i+1]){
                r++;
            }else {
                r=1;
            }
            ret += Math.max(candyCounts[i], r);
            candyCounts3[i] = ret;
            ret = 0;
        }
        System.out.println();
        for (int candyCount : candyCounts3) {
            System.out.print(candyCount + "\t");
        }
        int sum = 0;
        for (int i : candyCounts3) {
            sum += i;
        }

        return ret;
    }

    public static void main(String[] args) {
        int[] ratings = {1,3,2,2,1};
        candy2(ratings);
    }
}
