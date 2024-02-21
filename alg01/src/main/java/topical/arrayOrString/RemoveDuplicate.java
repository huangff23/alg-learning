package topical.arrayOrString;

/**
 * @author hff
 * @Description:删除有序数组中的重复项
 * @date 2023/8/16 16:37
 */
public class RemoveDuplicate {

    /**
    * 删除有序数组中的重复项
    * */
    public static int removeDuplicates(int[] nums) {
        int slow = 1;
        int fast = 1;
        while(fast < nums.length){
            if(nums[fast] != nums[fast - 1]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    /**
     * 删除有序数组中的重复项
     * */
    public int removeDuplicates2(int[] nums) {
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    /**
     * 删除有序数组中的重复项二
     * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使得出现次数超过两次的元素只出现两次 ，返回删除后数组的新长度。
     *
     * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
     * */
    public int removeDuplicatesTwo(int[] nums) {
        int slow = 2;
        int fast = 2;
        while(fast < nums.length){
            if(nums[fast] != nums[fast - 2]){
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = {1,1};
        removeDuplicates(nums);
        for (int num : nums) {
            System.out.print(num + "\t");
        }
    }
}
