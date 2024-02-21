package sort;

import java.util.Arrays;

/**
  * @Description: 快速排序
  */
public class QuickSort {

    public static void qSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        qSort(arr,0, arr.length - 1);
    }

    public static void qSort(int[] arr, int l, int r){
        if(l < r){
            swap(arr, l + (int)(Math.random() * (r - l + 1)), r);
            int[] p = partition(arr, l, r);
            qSort(arr, l, p[0] - 1);
            qSort(arr,p[1] + 1, r);
        }

    }

    public static int[] partition(int[] arr, int l, int r){
        int less = l - 1;
        int more = r;
        int num = arr[r];
        while(l < more){
            if(arr[l] < num){
                less++;
                swap(arr, less, l);
                l++;
            }else if(arr[l] > num){
                more--;
                swap(arr, more, l);
            }else{
                l++;
            }
        }
        swap(arr, more, r);
        return new int[]{less + 1, more - 1};
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
        qSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
