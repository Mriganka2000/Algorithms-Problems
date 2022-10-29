public class BinarySearchTree {

    public Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    private Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }
        else if (root.data > data) {
            root.left = insert(root.left, data);
        }
        else if (root.data < data) {
            root.right = insert(root.right, data);
        }

        return root;
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private int minValue(Node root) {
        Node temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp.data;
    }

    public Node delete(Node root, int data) {
        if (root == null) {
            return null;
        }

        if (root.data > data) {
            root.left = delete(root.left, data);
        }
        else if (root.data < data) {
            root.right = delete(root.right, data);
        }
        else {
            if (root.left == null) {
                return root.right;
            }
            else if (root.right == null) {
                return root.left;
            }

            root.data = minValue(root.right);
            root.right = delete(root.right, root.data);
        }

        return root;
    }

    public void inOrder(Node root) {
        if (root != null) {
            inOrder(root.left);
            System.out.println(root.data);
            inOrder(root.right);
        }
    }
}
