package LeetCode_Problems.Tree;

import java.util.*;

public class BT_ZigZag_Level_Order_Traversal_103 {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> result = new ArrayList<>();
            if (root == null) return result;

            Deque<TreeNode> deque = new LinkedList<>();
            deque.offer(root);
            boolean reverse = false; // direction flag

            while (!deque.isEmpty()) {
                int levelSize = deque.size();
                List<Integer> currentLevel = new ArrayList<>(levelSize);

                for (int i = 0; i < levelSize; i++) {
                    if (!reverse) {
                        // left to right
                        TreeNode node = deque.pollFirst();
                        currentLevel.add(node.val);
                        if (node.left != null) deque.offerLast(node.left);
                        if (node.right != null) deque.offerLast(node.right);
                    } else {
                        // right to left
                        TreeNode node = deque.pollLast();
                        currentLevel.add(node.val);
                        if (node.right != null) deque.offerFirst(node.right);
                        if (node.left != null) deque.offerFirst(node.left);
                    }
                }

                result.add(currentLevel);
                reverse = !reverse; // flip direction after finishing the level
            }

            return result;
        }
    }

