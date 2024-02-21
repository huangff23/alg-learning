package topical.arrayOrString;

/**
 * @author hff
 * @Description:
 */
public class ExceptSelf {

    /**
    * O(n*n)
    * */
    public static int[] productExceptSelf(int[] nums) {
        int[] results = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = 1;
            for (int j = 0; j < nums.length; j++) {
                if(i == j){
                    continue;
                }
                temp = temp * nums[j];
            }
            results[i] = temp;
        }

        return results;
    }

    /**
     * O(n)
     * */
    public static int[] productExceptSelf_2(int[] nums) {
        int[] arrayL = new int[nums.length];
        int[] arrayR = new int[nums.length];
        int[] results = new int[nums.length];

        arrayL[0] = 1;
        for (int i = 1; i < arrayL.length; i++) {
            arrayL[i] = arrayL[i-1] * nums[i-1];
        }

        arrayR[arrayR.length - 1] = 1;
        for (int i = arrayR.length - 2; i >= 0; i--) {
            arrayR[i] = arrayR[i+1] * nums[i+1];
        }

        for (int i = 0; i < nums.length; i++) {
            results[i] = arrayL[i] * arrayR[i];
        }

        return results;
    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int nums2[] = {-1,1,0,-3,3};
        int[] results = productExceptSelf_2(nums);
        for (int result : results) {
            System.out.print(result + "\t");
        }
    }
}
