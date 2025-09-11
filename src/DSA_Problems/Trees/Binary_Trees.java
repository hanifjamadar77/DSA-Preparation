package DSA_Problems.Trees;

import java.util.Scanner;

public class Binary_Trees {
    public class Node{
        int value;
        Node left;
        Node right;

        public Node (int value){
            this.value = value;
        }
    }

    private Node root;
//    Insert Elements

    public void populate(Scanner scanner){
        System.out.println("Enter the root Node : ");
        int value = scanner.nextInt();
        root = new Node(value);

        populate(scanner, root);
    }

    private void populate(Scanner scanner,Node node) {
        System.out.println("Do you want to insert to left of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }
        System.out.println("Do you want to insert to right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);
        }
    }
    public void display(){
        display(root, 0);
    }
    private void display(Node node, int level){
        if(node == null){
            return;
        }

        display(node.right, level + 1);

        if(level != 0){
            for(int i = 0; i < level - 1; i++){
                System.out.println("|\t\t");
            }
            System.out.println("|---------->" + node.value);
        }else {
            System.out.println(node.value);
        }
        display(node.left, level + 1);
    }
}
