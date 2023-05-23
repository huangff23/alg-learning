package alg01;

/**
 * @Description: 选择排序
 */
public class SelectSort {

    private static void sSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length ; j++) {
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
    }

    private static void findmin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("最小值：" + min);
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
        /*int[] arr = {6,5,3,7,2,8 };
        sSort(arr);
        System.out.println(Arrays.toString(arr));*/
        String url = "login.html";
        if (url.indexOf("login.html") != -1) {
            //toUrl = "login";
            System.out.println("hhhhhhhhh");
        }
    }

}
