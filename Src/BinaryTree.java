package Src;

public class BinaryTree extends TreeAbstractClass {
   public TreeNode root;

   public BinaryTree(){}
   public BinaryTree(String filename){
        Build(filename);
        //GetHeight(root);
       // showTree();
   }

@Override
public void Build(String filename) {
    
    TreeNode newnode=new TreeNode();
    

}

@Override
public int GetHeight(TreeNode root) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetHeight'");
}

@Override
public void InorderTraversal(TreeNode root) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'InorderTraversal'");
}

@Override
public void showTree() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showTree'");
}

}