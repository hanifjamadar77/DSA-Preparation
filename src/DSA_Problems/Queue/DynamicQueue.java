package DSA_Problems.Queue;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class DynamicQueue extends CircularQueue {
    public DynamicQueue() {
        super();
    }
    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {
        if(this.isFull()){
//            Double the array size
            int[] temp = new int[data.length * 2];

//            Copy all previous items in new data
            for(int i = 0; i < data.length; i++){
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            end = data.length;
            data = temp;
        }
//        At this point we know that array is not full
//        Insert item
        return super.insert(item);
    }
}
