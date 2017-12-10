package week_005_binary_tree.binary_search_tree;

public class Node {
    public Object data;
    public Node left;
    public Node right;

    public Node(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}