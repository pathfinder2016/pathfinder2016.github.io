package week_005_binary_tree;

class BinarySearchTree<T extends Comparable<T>> {
    Node root;

    boolean insert(T i) {
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
        System.out.print(root.data + " ");
        pre_order_traversal_recursion_way(root.left);
        pre_order_traversal_recursion_way(root.right);
    }

    void mid_order_traversal_recursion_way(Node root){
        if(root == null){
            return;
        }
        mid_order_traversal_recursion_way(root.left);
        System.out.print(root.data+" ");
        mid_order_traversal_recursion_way(root.right);
    }

    void post_order_traversal_recursion_way(Node root){
        if(root == null){
            return;
        }
        post_order_traversal_recursion_way(root.left);
        post_order_traversal_recursion_way(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
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
        binarySearchTree.post_order_traversal_recursion_way(root);
    }
}