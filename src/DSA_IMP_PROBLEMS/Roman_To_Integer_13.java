package DSA_IMP_PROBLEMS;

import java.util.HashMap;
import java.util.Map;

public class Roman_To_Integer_13 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }

    static Map<String, Integer> values = new HashMap<>();

    // Adding all the roman with their values in HashMap
    static{
        values.put("I",1);
        values.put("V",5);
        values.put("X",10);
        values.put("L",50);
        values.put("C",100);
        values.put("D",500);
        values.put("M",1000);
        values.put("IV",4);
        values.put("IX",9);
        values.put("XL",40);
        values.put("XC",90);
        values.put("CD",400);
        values.put("CM",900);
    }
    public static int romanToInt(String s) {
        int sum = 0;
        int i = 0;
        while(i<s.length()){
            if(i<s.length()-1){
                // Check for two pairs present then take then both together for sum
                String twoSymbols = s.substring(i, i+2);
                if(values.containsKey(twoSymbols)){
                    sum += values.get(twoSymbols);
                    i= i+2;
                    continue;
                }
            }

            // Check for single roman letter for sum
            String oneSymbols = s.substring(i, i+1);
            sum += values.get(oneSymbols);
            i= i+1;
        }
        return sum;
    }
}
