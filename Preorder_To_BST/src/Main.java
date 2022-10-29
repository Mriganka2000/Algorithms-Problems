public class Main {

    public static void main(String[] args) {
        int size = 8;
        int[] arr = {40, 30, 32, 35, 80, 90, 100, 120};

        BinarySearchTree tree = new BinarySearchTree();
        Node root = tree.postOrder(arr, size);
        tree.inOrder(root);
    }
}