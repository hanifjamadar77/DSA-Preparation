package DSA_Problems.Stack;

import java.util.Stack;

public class Implementation {
    public static void main(String[] args) {
//        Time Complexity is constant O(1)
//        Stack is class in java

    Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
