package challenges.datastructures;

import org.junit.Before;
import org.junit.Test;

import static com.google.common.collect.Lists.newArrayList;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class DFSTraversalTest {

    private BinaryTree binaryTree = new BinaryTree(5);
    private DFSTraversal dfsTraversal = new DFSTraversal();

    @Before
    public void setUp() {
        binaryTree.add(new Node(2));
        binaryTree.add(new Node(4));
        binaryTree.add(new Node(8));
        binaryTree.add(new Node(6));
        binaryTree.add(new Node(7));
        binaryTree.add(new Node(3));
        binaryTree.add(new Node(9));
    }

    @Test
    public void traverseInOrder() {
        assertThat(dfsTraversal.traverseInOrder(binaryTree.root, newArrayList())).isEqualTo(newArrayList(2, 3, 4, 5, 6, 7, 8, 9));
    }

    @Test
    public void traversePreOrder() {
        assertThat(dfsTraversal.traversePreOrder(binaryTree.root, newArrayList())).isEqualTo(newArrayList(5, 2, 4, 3, 8, 6, 7, 9));
    }

    @Test
    public void traversePostOrder() {
        assertThat(dfsTraversal.traversePostOrder(binaryTree.root, newArrayList())).isEqualTo(newArrayList(3, 4, 2, 7, 6, 9, 8, 5));
    }
}