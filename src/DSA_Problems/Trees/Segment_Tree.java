package DSA_Problems.Trees;

public class Segment_Tree {
    public class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    Node root;

    public Segment_Tree(int[] arr) {
        this.root = constructTree(arr, 0, arr.length - 1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }
        Node node = new Node(start, end);
        int mid = (start + end) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid + 1, end);

        node.data = node.left.data + node.right.data; // sum segment tree
        return node;
    }

    // Query
    public int query(int qsi, int qei) {
        return this.query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        // Completely inside
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }
        // Completely outside
        else if (node.endInterval < qsi || node.startInterval > qei) {
            return 0;
        }
        // Partial overlap
        return this.query(node.left, qsi, qei) + this.query(node.right, qsi, qei);
    }

    // Update Function
    public void update(int index, int value) {
        update(this.root, index, value);
    }

    private int update(Node node, int index, int value) {
        // index is outside range
        if (index < node.startInterval || index > node.endInterval) {
            return node.data;
        }

        // leaf node
        if (node.startInterval == node.endInterval) {
            node.data = value;
            return node.data;
        }

        int leftAns = update(node.left, index, value);
        int rightAns = update(node.right, index, value);
        node.data = leftAns + rightAns;
        return node.data;
    }

    // Display Function
    public void display() {
        display(this.root);
    }

    private void display(Node node) {
        if (node == null) return;

        String str = "";
        if (node.left != null) {
            str += "Left(" + node.left.data + ") ";
        }
        str += "<-- [" + node.startInterval + "," + node.endInterval + "] = " + node.data + " -->";
        if (node.right != null) {
            str += " Right(" + node.right.data + ")";
        }

        System.out.println(str);

        display(node.left);
        display(node.right);
    }
}
