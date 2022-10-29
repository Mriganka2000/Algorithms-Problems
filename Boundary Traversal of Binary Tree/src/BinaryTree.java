public class BinaryTree {

    public void printLeaves(Node root) {
        if (root == null) {
            return;
        }

        printLeaves(root.left);

        if (root.left == null && root.right == null) {
            System.out.println(root.data);
        }

        printLeaves(root.right);
    }

    public void printLeftBoundary(Node root) {
        if (root == null) {
            return;
        }

        if (root.left != null) {
            System.out.println(root.data);
            printLeftBoundary(root.left);
        }
        else if (root.right != null) {
            System.out.println(root.data);
            printLeftBoundary(root.right);
        }
    }

    public void printRightBoundary(Node root) {
        if (root == null) {
            return;
        }

        if (root.right != null) {
            printRightBoundary(root.right);
            System.out.println(root.data);
        }
        else if (root.left != null) {
            printRightBoundary(root.left);
            System.out.println(root.data);
        }
    }

    public void printBoundary(Node root) {
        if (root == null) {
            return;
        }
        System.out.println(root.data);

        printLeftBoundary(root.left);
        printLeaves(root.left);
        printLeaves(root.right);
        printRightBoundary(root.right);
    }
}
