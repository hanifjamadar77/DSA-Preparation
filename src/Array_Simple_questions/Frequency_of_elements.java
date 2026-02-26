package Array_Simple_questions;

// Find frequency of elements

import java.util.HashMap;

public class Frequency_of_elements {
    public static void main(String[] args) {
        int[] arr ={1,2,1,4,4,6,6,4};
        frequencyOfElements(arr);
    }

    public static void frequencyOfElements(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            }
            else{
                map.put(arr[i], 1);
            }
        }
        for(int key :  map.keySet()){
            System.out.println(key + "-->" + map.get(key));
        }
    }
}
