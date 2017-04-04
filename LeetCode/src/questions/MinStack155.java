package questions;

import utility.Common;

import java.util.Stack;

/**
 * Created by Lenny on 04/04/2017.
 */
public class MinStack155 {
    /** initialize your data structure here. */
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;

    public MinStack155() {
        stack = new Stack<>();
    }

    public void push(int x) {
        if(x <= min) {
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }

    public void pop() {
        if( stack.pop() == min) {
            min = stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }
}
