public class Main {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(0);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(0);

        BinaryTree tree = new BinaryTree();
        System.out.println(tree.minCameraCover(root));
    }
}