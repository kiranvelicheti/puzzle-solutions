package challenges.datastructures;

public class DFSSearch {

    public boolean result;

    public void searchInOrder(Node node, int valueToSearch) {
        if (!this.result) {
            if (node != null) {
                searchInOrder(node.left, valueToSearch);
                this.result = this.result || node.value == valueToSearch;
                searchInOrder(node.right, valueToSearch);
            }
        }
    }

    public void searchPreOrder(Node node, int valueToSearch) {
        if (!this.result) {
            if (node != null) {
                this.result = node.value == valueToSearch;
                searchPreOrder(node.left, valueToSearch);
                searchPreOrder(node.right, valueToSearch);
            }
        }
    }

    public void searchPostOrder(Node node, int valueToSearch) {
        if (!this.result) {
            if (node != null) {
                searchPostOrder(node.left, valueToSearch);
                searchPostOrder(node.right, valueToSearch);
                this.result = this.result || node.value == valueToSearch;
            }
        }
    }
}
