package queuestack;

/**
 * @Description: 数组实现栈
 */
public class ArrayToStack {

    public static class ArrayStack{
        private Integer[] arr;
        private Integer size;

        private ArrayStack() {
        }

        public ArrayStack(int initSize) {
            if(initSize < 0){
                throw new IllegalArgumentException("the init size is less than 0");
            }
            arr = new Integer[initSize];
            size = 0;
        }

        public void push(int num){
            if(size == arr.length){
                throw new ArrayIndexOutOfBoundsException("the queue is full");
            }
            arr[size++] = num;
        }

        public Integer pop(){
            if(size == 0){
                throw new ArrayIndexOutOfBoundsException("the queue is empty");
            }
            return arr[--size];
        }

        public Integer peek(){
            if(size == 0){
                return null;
            }
            return arr[size - 1];
        }
    }
}
