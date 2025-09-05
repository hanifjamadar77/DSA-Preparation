package DSA_Problems.Queue;

import java.util.*;

public class Implementation {
    public static void main(String[] args) {
//        Queue is s interface in java
//        Constant time complexity

//        Queue<Integer> queue = new LinkedList<>();
//
//        queue.add(1);
//        queue.add(2);
//        queue.add(3);
//        queue.add(4);
//        queue.add(5);
//
////        System.out.println(queue.peek());
//
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());
//        System.out.println(queue.remove());

//        Deque - You can insert and delete the elements from both sides (start and end) . Faster then stack, queue, LinkedList
        Deque<Integer> deque = new ArrayDeque<>();

        deque.push(1);
        deque.addLast(2);
        deque.addFirst(3);

        deque.removeFirst();
        deque.removeLast();

//        etc methods we can use

     }
}
