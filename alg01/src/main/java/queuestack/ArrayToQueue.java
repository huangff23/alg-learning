package queuestack;

/**
 * @Description: 数组实现队列
 */
public class ArrayToQueue {

    public static class ArrayQueue{
        private Integer[] arr;
        private Integer size;
        private Integer first;
        private Integer last;

        private ArrayQueue(){}

        public ArrayQueue(Integer initSize) {
            if(initSize < 0){
                throw new IllegalArgumentException("the init size is less than 0");
            }
            arr= new Integer[initSize];
            size = 0;
            first = 0;
            last = 0;
        }

        public void push(int num){
            if(size == arr.length){
                throw new ArrayIndexOutOfBoundsException("the queue is full");
            }
            size++;
            arr[last] = num;
            last = last == arr.length - 1 ? 0 :last + 1;
        }

        public Integer pop(){
            if(size == 0){
                throw new ArrayIndexOutOfBoundsException("the queue is empty");
            }
            size --;
            Integer temp = arr[first];
            first = first == arr.length - 1 ? 0 : first +1;
            return temp;
        }

        public Integer peek(){
            if(size == 0){
                return null;
            }
            return arr[first];
        }
    }
}
