package week_005_binary_tree;

import junit.framework.Assert;
import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void test_insert_order_data() throws Exception {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(8);

        System.out.println(binarySearchTree.toString());
        Assert.assertEquals(1, binarySearchTree.root.data);
    }

    @Test
    public void test_insert_disorder_data() throws Exception {
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
        Assert.assertEquals(5, root.data);
        Assert.assertEquals(2, root.left.data);
        Assert.assertEquals(1, root.left.left.data);
        Assert.assertNull(root.left.left.left);
        Assert.assertEquals(4, root.left.right.data);
    }

    @Test
    public void test_isContains_when_binary_search_tree_is_not_empty() throws Exception {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree();

        binarySearchTree.insert(1);
        binarySearchTree.insert(2);
        binarySearchTree.insert(3);
        binarySearchTree.insert(4);
        binarySearchTree.insert(5);
        binarySearchTree.insert(6);
        binarySearchTree.insert(7);
        binarySearchTree.insert(8);

        Assert.assertTrue(binarySearchTree.contains(1));
        Assert.assertTrue(binarySearchTree.contains(8));
        Assert.assertFalse(binarySearchTree.contains(0));
        Assert.assertFalse(binarySearchTree.contains(9));
    }

    @Test
    public void test_isContains_when_binary_search_tree_is_empty() throws Exception {
        BinarySearchTree<Integer> binarySearchTree = new BinarySearchTree();

        Assert.assertFalse(binarySearchTree.contains(0));
        Assert.assertFalse(binarySearchTree.contains(9));
    }

    @Test
    public void test_preOrder_Traversal_recursion_way(){
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
        binarySearchTree.pre_order_traversal_recursion_way(root);
    }
}