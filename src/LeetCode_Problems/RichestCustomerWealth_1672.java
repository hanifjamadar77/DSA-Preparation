package LeetCode_Problems;

public class RichestCustomerWealth_1672 {
    public static void main(String[] args) {
    }

    public int maximumWealth(int[][] accounts) {
  //        person = rows;
//          account = colums
        int ans = Integer.MIN_VALUE;

//        for(int person =0 ; person < accounts.length ; person++){
//            for (int account=0 ; account< accounts[person].length ; account++){
//                sum += accounts[person][account];
//            }
        for(int[] person : accounts ){
            int sum =0;
            for(int account : person){
                sum += account;
            }
            if(sum > ans){
                ans = sum;
            }

        }
        return ans;
    }
}
