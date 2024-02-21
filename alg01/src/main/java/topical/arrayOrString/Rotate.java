package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 * @date 2023/8/17 14:26
 */
public class Rotate {

    /**
    * 给定一个整数数组 nums，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
    * */
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] temps = new int[len];
        for (int i = 0; i < nums.length; i++) {
            temps[(i + k)%len] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = temps[i];
        }
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};//5671234
        rotate(nums, 3);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
