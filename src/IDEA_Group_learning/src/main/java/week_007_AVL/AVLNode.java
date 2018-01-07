package week_007_AVL;

public class AVLNode<T extends Comparable> {
    public AVLNode<T> left;
    public AVLNode<T> right;
    public T data;
    public int height;

    public AVLNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
        this.height = 1;
    }
}