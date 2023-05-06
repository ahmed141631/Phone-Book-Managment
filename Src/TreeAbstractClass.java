package Src;

/**
 * This abstract class contains shared attributes and methods for AVL and Heap trees.
 */
public abstract class TreeAbstractClass {

    protected int size;

    /**
     * Builds the tree.
     */
    public abstract TreeNode Build();

    /**
     * Computes the height of the tree rooted at the given node.
     * @param node the root of the tree
     * @return the height of the tree
     */
    public int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = getHeight(node.leftChild);
        int rightHeight = getHeight(node.rightChild);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Traverses the tree in-order and prints the data of each node.
     * @param root the root of the tree
     */
    public void InorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        InorderTraversal(root.leftChild);
        root.getData();
        InorderTraversal(root.rightChild);
    }

    /**
     * Displays the tree in a user-readable format.
     */
    public abstract void showTree();
}