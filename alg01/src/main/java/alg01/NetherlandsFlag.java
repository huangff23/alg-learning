package alg01;

import java.util.Arrays;

/**
 * @Description: 荷兰国旗问题
 */
public class NetherlandsFlag {

    /**
    * 给定一个数组，将小于这个数的放在数组左边，等于这个数的放在数组中间，大于这个数的放在数组右边
    * */
    public static void partition(int[] arr, int l, int r, int num){
        int less = l - 1;
        int more = r + 1;
        //3,5,6,7,2,8   5
        while(l < more){
            if(arr[l] < num){
                less++;
                swap(arr, less, l);
                l++;
            }else if(arr[l] == num){
                l++;
            }else{
                more--;
                swap(arr, l, more);
            }
        }
    }

    /**
    * 交换数组中的两个数的位置
    * */
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,7,2,8 };
        partition(arr,0, arr.length - 1, 5);
        System.out.println(Arrays.toString(arr));
    }
}
