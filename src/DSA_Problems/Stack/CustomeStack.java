package DSA_Problems.Stack;

public class CustomeStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomeStack() {
        this(DEFAULT_SIZE);
    }
    public CustomeStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if(isFull()){
            System.out.println("Stack is full");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot pop from an Empty stack");
        }
//        ptr --;
//        return data[ptr];
        return data[ptr--];
    }

    public int peek() throws StackException {
        if(isEmpty()){
            throw new StackException("Cannot Peek from an Empty stack");
        }
        return data[ptr];
    }

    public boolean isFull() {
        return ptr == data.length-1;  // ptr is at last index
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}
