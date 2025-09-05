package DSA_Problems.Stack;

public class StackMain {
    public static void main(String[] args) throws Exception {
//        CustomeStack stack = new CustomeStack(5);

        DynamicStack stack = new DynamicStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
