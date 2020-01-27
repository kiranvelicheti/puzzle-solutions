package challenges.datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class BFSSearchTest {

    private BFSSearch bfsSearch = new BFSSearch();
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
    public void searchInOrder() {
        bfsSearch.searchInOrder(binaryTree.root, 7);

        assertThat(bfsSearch.result).isTrue();
    }

    @Test
    public void searchInOrder_firstElement() {
        bfsSearch.searchInOrder(binaryTree.root, 5);

        assertThat(bfsSearch.result).isTrue();
    }

    @Test
    public void searchInOrder_returnFalse() {
        bfsSearch.searchInOrder(binaryTree.root, 10);

        assertThat(bfsSearch.result).isFalse();
    }
}