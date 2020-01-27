package challenges.datastructures;

public class BinaryTree {

    public Node root;

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public void add(Node node) {
        addRecursive(root, node);
    }

    private void addRecursive(Node root, Node node) {
        if (node.value < root.value) {
            if (root.left == null) {
                root.left = node;
            } else
                addRecursive(root.left, node);

        } else if (node.value > root.value) {
            if (root.right == null) {
                root.right = node;
            } else
                addRecursive(root.right, node);
        }
    }
}
