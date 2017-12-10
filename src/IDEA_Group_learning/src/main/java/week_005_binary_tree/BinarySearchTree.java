package week_005_binary_tree;

import data_structure.Stack;
import exception.StackEmptyException;
import sun.util.resources.cldr.ebu.CurrencyNames_ebu;
import sun.util.resources.cldr.sr.CalendarData_sr_Cyrl_RS;

import java.util.LinkedList;
import java.util.Queue;

import static java.lang.System.*;
import static java.lang.System.out;
import static java.lang.System.setOut;

class BinarySearchTree<T extends Comparable<T>> {
    Node root;
    int nodeNum = 0;

    boolean insert(T i) {
        nodeNum++;
        if (root == null) {
            root = new Node(i);
            return true;
        }

        Node current = root;
        while (true) {
            if (i.compareTo((T) current.data) < 0) {
                if (current.left != null) {
                    current = current.left;
                } else {
                    current.left = new Node(i);
                    break;
                }
            } else {
                if (current.right != null) {
                    current = current.right;
                } else {
                    current.right = new Node(i);
                    break;
                }
            }
        }
        return true;
    }

    boolean contains(T t) {
        Node currentNode = root;
        while (true) {
            if (currentNode == null) {
                return false;
            }
            if (t.compareTo((T) currentNode.data) < 0) {
                currentNode = currentNode.left;
            } else if (t.compareTo((T) currentNode.data) == 0) {
                return true;
            } else {
                currentNode = currentNode.right;
            }

        }
    }

    void pre_order_traversal_recursion_way(Node root) {
        if (root == null) {
            return;
        }
        out.print(root.data + " ");
        pre_order_traversal_recursion_way(root.left);
        pre_order_traversal_recursion_way(root.right);
    }

    void mid_order_traversal_recursion_way(Node root){
        if(root == null){
            return;
        }
        mid_order_traversal_recursion_way(root.left);
        out.print(root.data+" ");
        mid_order_traversal_recursion_way(root.right);
    }

    void post_order_traversal_recursion_way(Node root){
        if(root == null){
            return;
        }
        post_order_traversal_recursion_way(root.left);
        post_order_traversal_recursion_way(root.right);
        out.print(root.data+" ");
    }

    // 先序遍历思想：先让根进栈，只要栈不为空，就可以做弹出操作，
    // 每次弹出一个结点，记得把它的左右结点都进栈，
    // 记得右子树先进栈，这样可以保证右子树在栈中总处于左子树的下面
    void pre_order_traversal_not_recursion_way(Node root) throws StackEmptyException {
        Stack<Node> stack = new Stack(100);
        Node currentNode= root;
        stack.push(currentNode);
        while (!stack.isEmpty()){
            currentNode = stack.pop();
            out.print(currentNode.data + " ");
            if(currentNode.right != null){
                stack.push(currentNode.right);
            }
            if(currentNode.left != null){
                stack.push(currentNode.left);
            }
        }
    }

    private void post_order_traversal_not_recursion_way(Node root) {

    }

    /*
        1. 往左孩子，一直进栈
        2. 碰到为空，出栈
        3. 以此类推
     */

    private void mid_order_traversal_not_recursion_way(Node root) throws StackEmptyException {
        Stack<Node> stack = new Stack(100);
        Node currentNode = root;
        while (currentNode != null || !stack.isEmpty()){
            if(currentNode != null){
                stack.push(currentNode);
                currentNode = currentNode.left;
            }else{
                Node topNode = stack.pop();
                out.print(topNode.data + " ");
                currentNode = topNode.right;
            }
        }
    }

    private void level_order(Node root){
        Queue<Node> queue = new LinkedList();
        Node currentNode = root;
        queue.add(currentNode);

        while (!queue.isEmpty()){
            currentNode = queue.poll();
            out.print(currentNode.data+ " ");
            if(currentNode.left != null){
                queue.add(currentNode.left);
            }
            if(currentNode.right != null){
                queue.add(currentNode.right);
            }
        }
    }

    public static void main(String[] args) throws StackEmptyException {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(5);
        binarySearchTree.insert(2);
        binarySearchTree.insert(1);
        binarySearchTree.insert(4);
        binarySearchTree.insert(9);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(8);
        binarySearchTree.insert(3);

        Node root = binarySearchTree.root;
        out.println("递归：-----------------------------");
        binarySearchTree.pre_order_traversal_recursion_way(root);
        out.println();
        binarySearchTree.mid_order_traversal_recursion_way(root);
        out.println();
        binarySearchTree.post_order_traversal_recursion_way(root);
        out.println("\n非递归：-----------------------------");
        binarySearchTree.pre_order_traversal_not_recursion_way(root);
        out.println();
        binarySearchTree.mid_order_traversal_not_recursion_way(root);
//        System.out.println();
//        binarySearchTree.post_order_traversal_not_recursion_way(root);

        out.println("\n层次遍历");
        binarySearchTree.level_order(root);
    }
}