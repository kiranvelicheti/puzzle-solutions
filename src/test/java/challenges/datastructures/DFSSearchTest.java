package challenges.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DFSSearchTest {

    private DFSSearch dfsSearch = new DFSSearch();
    private BinaryTree binaryTree = new BinaryTree(5);

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
        dfsSearch.searchInOrder(binaryTree.root, 8);
        assertThat(dfsSearch.result).isTrue();
    }

    @Test
    public void searchPreOrder() {
        dfsSearch.searchPreOrder(binaryTree.root, 9);
        assertThat(dfsSearch.result).isTrue();
    }

    @Test
    public void searchPostOrder() {
        dfsSearch.searchPostOrder(binaryTree.root, 9);
        assertThat(dfsSearch.result).isTrue();
    }
}