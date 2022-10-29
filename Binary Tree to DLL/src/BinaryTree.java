public class BinaryTree {

    private Node head = null;

    private Node binaryTreeToDLL(Node root) {
        if (root == null) {
            return null;
        }

        if (root.left != null) {
            Node left = binaryTreeToDLL(root.left);

            while (left.right != null) {
                left = left.right;
            }

            left.right = root;
            root.left = left;
        }

        if (root.right != null) {
            Node right = binaryTreeToDLL(root.right);

            while (right.left != null) {
                right = right.left;
            }

            right.left = root;
            root.right = right;
        }

        return root;
    }

    public Node bToDLL(Node root) {
        if (root == null) {
            return null;
        }

        root = binaryTreeToDLL(root);

        while (root.left != null) {
            root = root.left;
        }

        return root;
    }

    public void print(Node root) {
        Node temp = root;
        Node prev = null;

        while (temp != null) {
            System.out.println(temp.data);
            prev = temp;
            temp = temp.right;
        }

        System.out.println();
        while (prev != null) {
            System.out.println(prev.data);
            prev = prev.left;
        }
    }
}
