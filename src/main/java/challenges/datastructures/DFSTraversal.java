package challenges.datastructures;

import java.util.List;

public class DFSTraversal {

    public List<Integer> traverseInOrder(Node node, List<Integer> result) {
        if (node != null) {
            traverseInOrder(node.left, result);
            result.add(node.value);
            traverseInOrder(node.right, result);
        }
        return result;
    }

    public List<Integer> traversePreOrder(Node node, List<Integer> result) {
        if (node != null) {
            result.add(node.value);
            traversePreOrder(node.left, result);
            traversePreOrder(node.right, result);
        }
        return result;
    }

    public List<Integer> traversePostOrder(Node node, List<Integer> result) {
        if (node != null) {
            traversePostOrder(node.left, result);
            traversePostOrder(node.right, result);
            result.add(node.value);
        }
        return result;
    }
}
