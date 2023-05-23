package alg01;

import java.util.Arrays;

/**
 * @Description: 冒泡排序
 */
public class BubbleSort {

    public static void bSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                }
            }
        }
    }

    /**
    * 冒泡排序优化
    * */
    public static void bSort2(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    swap(arr, i, j);
                    flag = false;
                }
            }
            if (flag){
                return;
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
        int[] arr = {1,2,3,4,7,8,9 };
        int[] arr2 = {1,2,3,4,7,8,9 };
        bSort(arr);
        bSort2(arr2);
        System.out.println("bSort: " + Arrays.toString(arr));
        System.out.println("bSort2: " + Arrays.toString(arr2));
    }
}
