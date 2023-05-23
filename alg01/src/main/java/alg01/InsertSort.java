package alg01;

import java.util.Arrays;

/**
 * @Description: 插入排序
 */
public class InsertSort {

    public static void iSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1] ; j--) {
                swap(arr, j ,j + 1);
            }
        }
    }

    /*
    * 生成的有序数组在后面
    * */
    public static void iSort2(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = arr.length - 1 - 1; i >= 0; i--) {
            for (int j = i + 1; j <= arr.length - 1 && arr[j] > arr[j - 1] ; j++) {
                swap(arr, j ,j - 1);
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
        iSort2(arr);
        System.out.println(Arrays.toString(arr));
    }

}
