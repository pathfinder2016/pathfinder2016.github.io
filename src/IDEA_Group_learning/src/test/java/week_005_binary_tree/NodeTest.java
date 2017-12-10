package week_005_binary_tree;

import junit.framework.Assert;
import org.junit.Test;

public class NodeTest {

    @Test
    public void basic(){
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);

        a.left = b;
        a.right = c;

        Assert.assertEquals("Node{data=1, " +
                "left=Node{data=2, left=null, right=null}, " +
                "right=Node{data=3, left=null, right=null}}",
                a.toString());
    }

}