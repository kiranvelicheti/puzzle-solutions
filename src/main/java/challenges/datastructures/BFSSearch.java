package challenges.datastructures;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSearch {

    public boolean result;

    public void searchInOrder(Node node, int valueToSearch) {
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        this.result = node.value == valueToSearch;
        while (!q.isEmpty()) {
            Node popped = q.remove();
            if (this.result) {
                break;
            } else {
                if (popped.left != null) {
                    this.result = popped.left.value == valueToSearch;
                    q.add(popped.left);
                }
                if (popped.right != null) {
                    this.result = popped.right.value == valueToSearch;
                    q.add(popped.right);
                }
            }
        }
    }
}
