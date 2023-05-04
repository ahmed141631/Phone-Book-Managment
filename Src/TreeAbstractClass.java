import java.io.File;

/**
 * this abstract class will indicates the share attrubites and methods that will each of the tree classes
 * will use  for AVL tree and Heap tree
 */

public abstract class TreeAbstractClass {
    /* these are the common attrubites that trees share */
    protected ContactNode root;
    protected ContactNode righContactNode;
    protected ContactNode leftContactNode;
    protected ContactNode parentContactNode;

    protected int size;

    /* these are the common methods that trees will  use */
    public abstract void Build(File file);
    public abstract int GetHeight(ContactNode root);
    public abstract void InorderTraversal(ContactNode root);
    public abstract void showTree();




    


}
