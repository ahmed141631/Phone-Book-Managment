package Src;

import java.util.ArrayList;

public class AVL extends TreeAbstractClass  implements IContactNodeOperations{
    String filename;
    public TreeNode root;
    ArrayList<ContactNode> contactNodeList;
    /* will extend this class and remove this object later */
   

    public AVL(){}
    public AVL(String filename){
        this.filename = filename;
        contactNodeList =readContactsFromFile(filename);

    //  for(int i=0; i<contactNodeList.size(); i++){
        this.root = insert(this.root, contactNodeList.get(0));
      
        System.out.println(contactNodeList.size());
       // root.getData();
        inorderTraversal(this.root);
        
    }

  /*
   * how to build Avl tree :
   * Perform the normal BST insertion. 
   *The current node must be one of the ancestors of the newly inserted node. Update the height of the current node. 
   Get the balance factor (left subtree height – right subtree height) of the current node. 
   *If the balance factor is greater than 1, then the current node is unbalanced and we are either in the Left Left case or left Right case. 
   *To check whether it is left left case or not,
    compare the newly inserted key with the key in the left subtree root. 
   *If the balance factor is less than -1, then the current node is unbalanced and we are either in the Right Right case or Right-Left case. 
   To check whether it is the Right Right case or not, compare the newly inserted key with the key in the right subtree root.    
   */


   public TreeNode rightRotate(TreeNode y){

   TreeNode x= y.leftChild;
   TreeNode t2 = x.rightChild;
   // Perform rotation
   x.rightChild = y;
   y.leftChild = t2;

       y.setHeight(Math.max(y.leftChild.getHeight(), y.rightChild.getHeight())+1);
       x.setHeight(Math.max(x.leftChild.getHeight(),x.rightChild.getHeight())+1);
    
    return x;


}
   public TreeNode leftRotate(TreeNode x){

    TreeNode y = x.leftChild;
    TreeNode t2 = y.rightChild;

    y.leftChild = x;
    x.rightChild = t2;

    x.setHeight(Math.max(x.leftChild.getHeight(),x.rightChild.getHeight())+1);
    y.setHeight(Math.max(y.leftChild.getHeight(),y.rightChild.getHeight())+1);
    
    return y;

}

public int getBalancedFactor(TreeNode node){
    if(node==null) return 0;
    return (node.leftChild.getHeight()-node.rightChild.getHeight());
}

public TreeNode insert(TreeNode rootNode, ContactNode node){
    TreeNode newnode = new TreeNode(node);
    if(rootNode == null){
        rootNode = newnode;
        System.out.println("i am here ");
        rootNode.getData();
        return rootNode;
    }
    System.out.println("u should nt be here ");
    if(node.getFirstName().compareTo(rootNode.data.getFirstName()) < 0){
        rootNode.leftChild = insert(rootNode.leftChild, node);
    } else if(node.getFirstName().compareTo(rootNode.data.getFirstName()) > 0){
        rootNode.rightChild = insert(rootNode.rightChild, node);
    } else{
        return rootNode;
    }

    // Check if the node is balanced and perform rotations if necessary
    rootNode.setHeight(1 + Math.max(getHeight(rootNode.leftChild), getHeight(rootNode.rightChild)));
    int balance = getBalancedFactor(rootNode);
    if (balance > 1 && node.getFirstName().compareTo(rootNode.leftChild.data.getFirstName()) < 0){
        return rightRotate(rootNode);
    }
    if (balance < -1 && node.getFirstName().compareTo(rootNode.rightChild.data.getFirstName()) > 0){
        return leftRotate(rootNode);
    }
    if (balance > 1 && node.getFirstName().compareTo(rootNode.leftChild.data.getFirstName()) > 0){
        rootNode.leftChild = leftRotate(rootNode.leftChild);
        return rightRotate(rootNode);
    }
    if (balance < -1 && node.getFirstName().compareTo(rootNode.rightChild.data.getFirstName()) < 0){
        rootNode.rightChild = rightRotate(rootNode.rightChild);
        return leftRotate(rootNode);
    }
    return rootNode;
}
@Override
public void addContact(String firstName, String lastName, String phoneNumber, String email, String address) {
    ContactNode contactNode = new ContactNode(firstName, lastName, phoneNumber, email, address);
    insert(root, contactNode);
   
}
@Override
public void deleteContact(String firstName, String lastName) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
}
@Override
public void updateContact(String firstName, String lastName, String phoneNumber, String email, String address) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'updateContact'");
}

}

