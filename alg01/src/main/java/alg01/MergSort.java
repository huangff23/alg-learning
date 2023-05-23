package alg01;

import java.util.Arrays;

/**
 * @Description: 归并排序
 */
public class MergSort {

    public static void mSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        mSort(arr, 0, arr.length - 1);
    }

    public static void mSort(int[] arr, int l, int r){
        if(l == r){
            return;
        }
        int mid = l + (r - l)/2;
        mSort(arr, l, mid);
        mSort(arr, mid + 1, r);
        merge(arr, l, mid, r);
    }

    public static void merge(int[] arr, int l, int m, int r){
        int[] help = new int[r - l + 1];
        int i = 0;
        int p1 = l;
        int p2 = m + 1;
        while (p1 <= m && p2 <= r){
            help[i++] = arr[p1] > arr[p2] ? arr[p2++] : arr[p1++];
        }
        while(p1 <= m){
            help[i++] = arr[p1++];
        }
        while(p2 <= r){
            help[i++] = arr[p2++];
        }
        for (i = 0; i < help.length; i++) {
            arr[l + i] = help[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6,5,3,7,2,8 };
        mSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
