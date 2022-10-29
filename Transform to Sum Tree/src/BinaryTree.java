public class BinaryTree {

    private int toSumTreeUtil(Node root) {
        if (root == null) {
            return 0;
        }

        int oldVal = root.data;
        root.data = toSumTreeUtil(root.left) + toSumTreeUtil(root.right);

        return root.data + oldVal;
    }

    public void toSumTree(Node root){
        int val = toSumTreeUtil(root);
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
