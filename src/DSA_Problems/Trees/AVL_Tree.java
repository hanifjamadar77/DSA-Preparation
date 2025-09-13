package DSA_Problems.Trees;

public class AVL_Tree {
    public class Node {
        private int value;
        private Node left;
        private Node right;
        private int height;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public int height(Node node) {
        if (node == null) return -1;
        return node.height;
    }

    public boolean isEmpty(Node node){
        return root == null;
    }

    public void populate(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void insert(int value){
        root = insert(value, root);
    }
    private Node insert(int value, Node node) {
        if(node == null){
            node = new Node(value);
            return node;
        }
        if(value < node.value){
            node.left = insert(value, node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        node.height = 1 + Math.max(height(node.left), height(node.right));
        return rotate(node);
    }

    public Node rotate(Node node){
        if(height(node.left) - height(node.right) > 1){
//            Left is Heavy
             if(height(node.left.left) - height(node.left.right) > 0 ){
//                Left Left case
                return rightRotate(node);
             }

            if(height(node.left.left) - height(node.left.right) < 0 ){
//                Left Right case
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        }

        if(height(node.left) - height(node.right) < -1){
//            Right is Heavy
            if(height(node.right.left) - height(node.right.right) < 0 ){
//                Right Right case
                return leftRotate(node);
            }

            if(height(node.right.left) - height(node.right.right) > 0 ){
//                Right Left case
                node.left = rightRotate(node.left);
                return leftRotate(node);
            }
        }
        return node;
    }

    private Node leftRotate(Node c){
        Node p = c.right;
        Node t = p.left;

        p.left = c;
        c.right = t;

        p.height = Math.max(height(c.left), height(c.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return p;
    }

    private Node rightRotate(Node p){
        Node c = p.left;
        Node t = c.right;

        c.right = p;
        p.left = t;

        p.height = Math.max(height(c.left), height(c.right) + 1);
        c.height = Math.max(height(c.left), height(c.right) + 1);

        return c;
    }


    public void populatedSorted(int[] nums){
        populatedSorted(nums, 0, nums.length);
    }
    private void populatedSorted(int[] nums, int start, int end){
        while(start >= end){
            return;
        }
        int mid = start + (end - start)/2;
        insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public boolean balanced(){
        return balanced(root);
    }
    private boolean balanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left) - height(node.right)) <= 1  &&  balanced(node.left) && balanced(node.right);
    }

    public void display(){
        display(root, "Root Node :");
    }
    private void display(Node node, String details){
        if(node == null){return;}
        System.out.println(details + node.value + " ");
        display(node.left, "Left child of " + node.value + ":");
        display(node.right, "Right child of " + node.value + ":");
    }
}
