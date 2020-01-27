package challenges.datastructures;

import org.junit.Test;

public class BinaryTreeTest {

    @Test
    public void add() {

        BinaryTree binaryTree = new BinaryTree(5);
        binaryTree.add(new Node(2));
        binaryTree.add(new Node(4));
        binaryTree.add(new Node(8));
        binaryTree.add(new Node(6));
        binaryTree.add(new Node(7));
        binaryTree.add(new Node(3));
        binaryTree.add(new Node(9));

    }
}