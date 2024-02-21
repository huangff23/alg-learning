package topical.arrayOrString;

/**
 * @author hff
 * @Description:移除元素
 * @date 2023/8/15 11:19
 */
public class RemoveElementInArray {

    public static int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        for (int i = 0; i <= j; i++) {
            if (nums[i] == val) {
                swap(nums, i--, j--);
            }
        }
        return j + 1;
    }
    private static void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }


    public static int removeElement2(int[] nums, int val) {
        int idx = 0;
        for (int x : nums) {
            if (x != val){
                nums[idx++] = x;
            }
        }
        return idx;
    }

    public static int removeElement3(int[] nums, int val) {
        if(nums.length == 0){
            return 0;
        }
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if(nums[i] == val){
                for (int j = i; j < len - 1 ; j++) {
                    nums[j] = nums[j+1];
                }
            }
            --i;
            --len;
        }
        return len;
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,2,4,6,3,3};
        removeElement3(nums, 3);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }

}
