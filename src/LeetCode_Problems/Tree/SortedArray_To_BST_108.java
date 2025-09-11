package LeetCode_Problems.Tree;

public class SortedArray_To_BST_108 {
    public static void main(String[] args) {

    }


//      Definition for a binary tree node.
      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
          }
      }

    class Solution {
        public TreeNode sortedArrayToBST(int[] nums) {
            // Create a helper function for binary search
            return binary_Tree(nums, 0, nums.length - 1);
        }

        public TreeNode binary_Tree(int[] nums, int start, int end){
            if(start > end){
                return null;
            }
            // Finding Mid
            int mid = start + (end-start) / 2;

            // Create a root Node
            TreeNode root = new TreeNode(nums[mid]);

            // Recursively inserting left and right
            root.left = binary_Tree(nums, start, mid - 1);
            root.right = binary_Tree(nums, mid + 1, end);

            return root;
        }
    }
}
