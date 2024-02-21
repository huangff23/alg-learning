package queuestack;

import java.util.Stack;

/**
 * @author hff
 * @Description:
 * @date 2023/5/25 10:54
 */
public class TwoStackQueue {
    private Stack<Integer> stackPush;
    private Stack<Integer> stackPop;

    public TwoStackQueue() {
        this.stackPush = new Stack<Integer>();
        this.stackPop = new Stack<Integer>();
    }

    public void push(int pushInt){
        stackPush.push(pushInt);
    }

    public Integer pop(){
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("queue is empty");
        }else if(stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.pop();
    }

    public Integer peek(){
        if(stackPop.empty() && stackPush.empty()){
            throw new RuntimeException("queue is empty");
        }else if(stackPop.empty()){
            while(!stackPush.empty()){
                stackPop.push(stackPush.pop());
            }
        }
        return stackPop.peek();
    }
}
