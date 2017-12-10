package week_005_binary_tree;

public class BinarySearchTree<T extends Comparable<T>> {
    private Node root;
    public boolean insert(T i){
        if(root == null){
            root = new Node(i);
            return true;
        }

        Node current = root;
        while(true){
            if(i.compareTo((T)current.data) < 0){
                if(current.left != null){
                    current = current.left;
                }else{
                    current.left = new Node(i);
                    break;
                }
            }else{
                if(current.right != null){
                    current = current.right;
                }else{
                    current.right = new Node(i);
                    break;
                }
            }
        }
        return true;
    }
}