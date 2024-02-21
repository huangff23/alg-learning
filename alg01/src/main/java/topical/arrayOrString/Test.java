package topical.arrayOrString;

import java.util.HashMap;
import java.util.Map;

/**
 * @author hff
 * @Description:
 * @date 2023/8/28 10:59
 */
public class Test {

    public static void main(String[] args) {
        int[] nums = new int[]{2,7,11,15};
        int[] ints = twoSum(nums, 9);
        for (int n : ints) {
            System.out.print(n + "\t");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
