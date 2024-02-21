package topical.arrayOrString;

/**
 * @author hff
 * @Description:合并两个有序数组
 * @date 2023/8/14 15:46
 */
public class MergeArray {
    /**
    * nums1 = [1,2,3,0,0,0] nums2 = [2,5,6]
    * */
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = m-1;
        int p2 = n-1;
        while(p1>=0 && p2>=0){
            nums1[p1 + p2 + 1] = nums1[p1] <= nums2[p2] ? nums2[p2--] : nums1[p1--];
        }

        while(p2 >= 0){
            nums1[p1+p2+1] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {4,0,0,0,0,0};
        int[] nums2 = {1,2,3,5,6};
        merge(nums1,1 , nums2, 5);
        for (int i : nums1) {
            System.out.print(i + "\t");
        }
    }
}

