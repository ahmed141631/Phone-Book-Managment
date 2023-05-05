package Src;


/**
 * this abstract class will indicates the share attrubites and methods that will each of the tree classes
 * will use  for AVL tree and Heap tree
 */

public abstract class TreeAbstractClass {
   

    protected int size;

    /* these are the common methods that trees will  use */
    public abstract TreeNode Build();
    public abstract int GetHeight(TreeNode root);
    public abstract void InorderTraversal(TreeNode root);
    public abstract void showTree();




    


}
