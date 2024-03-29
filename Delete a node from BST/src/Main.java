public class Main {

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
        20   40  60   80 */

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal of the given tree");
        tree.inOrder(tree.root);

        System.out.println("\nDelete 20");
        tree.delete(tree.root,20);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder(tree.root);

        System.out.println("\nDelete 30");
        tree.delete(tree.root,30);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder(tree.root);

        System.out.println("\nDelete 50");
        tree.delete(tree.root,50);
        System.out.println("Inorder traversal of the modified tree");
        tree.inOrder(tree.root);
    }
}