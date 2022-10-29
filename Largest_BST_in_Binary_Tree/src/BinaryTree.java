public class BinaryTree {

    private SubTreeInfo largestBstUtil(Node root) {
        if (root == null) {
            return new SubTreeInfo(Integer.MAX_VALUE, Integer.MIN_VALUE, 0, true);
        }

        SubTreeInfo left = largestBstUtil(root.left);
        SubTreeInfo right = largestBstUtil(root.right);
        SubTreeInfo info = null;

        if (left.isBST && right.isBST && root.data > left.max && root.data < right.min) {
            info = new SubTreeInfo(
                    Math.min(root.data, Math.min(left.min, right.min)), Math.max(root.data, Math.max(left.max, right.max)),
                    left.size + 1 + right.size, true
            );
        }
        else {
            info = new SubTreeInfo(0, 0, Math.max(left.size, right.size), false);
        }

        return info;
    }

    public int largestBst(Node root){
        SubTreeInfo result = largestBstUtil(root);

        return result.size;
    }
}
