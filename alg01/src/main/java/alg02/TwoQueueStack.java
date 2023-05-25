package alg02;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author hff
 * @Description:
 * @date 2023/5/25 10:54
 */
public class TwoQueueStack {

    private Queue<Integer> queue;
    private Queue<Integer> help;

    public TwoQueueStack() {
        queue = new LinkedList<Integer>();
        help = new LinkedList<Integer>();
    }

    public void push(int num){
        queue.add(num);
    }

    public int pop(){
        if(queue.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        while(queue.size() > 1){
            help.add(queue.poll());
        }
        int res = queue.poll();
        swap();
        return res;
    }

    public int peek(){
        if(queue.isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        while(queue.size() != 1){
            help.add(queue.poll());
        }
        int res = queue.poll();
        help.add(res);
        swap();
        return res;
    }

    private void swap() {
        Queue<Integer> temp = help;
        help = queue;
        queue = temp;
    }

}
