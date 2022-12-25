package learning;

import java.util.Queue;
import java.util.Stack;

public class StackPrac {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.peek());
        st.push(5);
        st.push(6);
        reverseStack(st);
        System.out.println(st.peek());

    }
    public static void reverseStack(Stack<Integer> st){
        if(st.isEmpty())
            return;
        int x=  st.pop();
        reverseStack(st);
        insertDown(st,x);
    }
    public static void insertDown(Stack<Integer> st, int x){
        if(st.isEmpty()) {
            st.push(x);
            return;
        }
        int y = st.pop();
        insertDown(st,x);
        st.push(y);
    }
//    public static void reverseQueue(Queue<Integer> que){
//        if(que.isEmpty())
//            return;
//        int x = que.
//    }
    // stack using queue
    //queue using stack
}
