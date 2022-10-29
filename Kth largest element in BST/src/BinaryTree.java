public class BinaryTree {
    static class Count {
        int count;

        public Count() {
            this.count = 0;
        }
    }

    private Node kthLargestUtil(Node root, int k, Count count) {
        if (root == null) {
            return null;
        }

        Node temp = kthLargestUtil(root.right,k, count);
        count.count++;

        if (temp != null) {
            return temp;
        }
        if (count.count == k) {
            return root;
        }

        return kthLargestUtil(root.left, k, count);
    }

    public int kthLargest(Node root, int K) {
        Count count = new Count();
        return kthLargestUtil(root, K, count).data;
    }
}
