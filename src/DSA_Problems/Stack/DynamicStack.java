package DSA_Problems.Stack;

public class DynamicStack extends CustomeStack{
    public DynamicStack(){
        super(); // It will call CustomeStack()
    }

    public DynamicStack(int size){
        super(size); // it will call CustomeStack(int size);
    }

    @Override
    public boolean push(int item){
        if(this.isFull()){
//            Double the array size
            int[] temp = new int[data.length * 2];

//            Copy all previous items in new data
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
//        At this point we know that array is not full
//        Insert item
        return super.push(item);
    }
}
