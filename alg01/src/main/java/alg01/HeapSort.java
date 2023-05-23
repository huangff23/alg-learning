package alg01;

import java.util.Arrays;

/**
 * @Description: 堆排序
 */
public class HeapSort {

    public static void hSort(int[] arr){
        if(arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int size = arr.length;
        swap(arr,0, --size);
        while(size > 0){
            heapify(arr, 0, size);
            swap(arr, 0, --size);
        }
    }

    private static void heapify(int[] arr, int index, int size) {
        int left = index*2 + 1;
        while(left < size){
            int largest = left + 1 < size && arr[left + 1] > arr[left] ? left + 1 : left;
            largest = arr[largest] > arr[index] ? largest : index;
            if(largest == index){
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }

    private static void heapInsert(int[] arr, int i) {
        if(arr[i] > arr[(i - 1) / 2]){
            swap(arr, i, (i - 1) / 2);
            i = (i - 1) / 2;
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
        hSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
