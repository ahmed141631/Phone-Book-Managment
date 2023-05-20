package Src;

import java.util.ArrayList;

/**
 * AVL tree structure
 */
public class AVL extends TreeAbstractClass{

   public TreeNode rootoNode;
   public String filename;
   public  ArrayList<ContactNode>contactNodes;


   public AVL() {}

   public AVL(String filename){
   // root = new TreeNode();
    this.filename = filename;
    this.contactNodes=readContactsFromFile(this.filename);

   // for(ContactNode contactNode : contactNodes){
        this.rootoNode=insertcontactNode(rootoNode, contactNodes.get(0));
        this.rootoNode=insertcontactNode(rootoNode, contactNodes.get(1));
        
   // }
   // inorderTraversal(this.root);
    
   }

   /* 
       public deletecontactNode(){};
       public searchcontactNode(){};
   */


   public int getbalancedfactror(TreeNode node){
    if(node ==null) return 0;
    return node.leftChild.getHeight()-node.rightChild.getHeight();
   }

   public TreeNode insertcontactNode(TreeNode root, ContactNode contactNode){
    /*
     * 1. do normal BST 
     * 
     * 2. caluclate the balanced tree
     * 
     * 3. if f any node in the tree has a balance factor that is
     * greater than 1 or less than -1, the tree is unbalanced and needs to be rebalanced.
     * 
     * 4. To rebalance the tree, perform one or more rotations on the unbalanced nodes.
     * There are four types of rotations: left rotation, right rotation, left-right rotation, and right-left rotation.
     *  The type of rotation to perform depends on the balance factor and structure of the tree. 
     * 
     * 5. Repeat steps 2-4 until the tree is balanced. This can be done through recursive processing of the subtrees.
     */

     if (contactNode == null) {
        return root;
    }
    if (root == null) {
        return new TreeNode(contactNode);
    }
    int comparison = root.data.getFirstName().compareTo(contactNode.getFirstName());
    if (comparison > 0) {
        root.leftChild = insertcontactNode(root.leftChild, contactNode);
    } else if (comparison < 0) {
        root.rightChild = insertcontactNode(root.rightChild, contactNode);
    } else {
        // contactNode already exists in the tree, do nothing
        return root;
    }
   



    



    return null;
   }



   public TreeNode leftRotate(TreeNode x){
    TreeNode y=x.rightChild;
    TreeNode t2=y.leftChild;
    y.leftChild=x;
    x.rightChild=t2;
    x.setHeight(getmax(x.leftChild.getHeight(), x.rightChild.getHeight())+1);
    y.setHeight(getmax(y.leftChild.getHeight(), y.rightChild.getHeight())+1);
    return y;
   }


   public TreeNode rightRotate(TreeNode y){
    TreeNode x=y.leftChild;
    TreeNode t2=x.rightChild;
    x.rightChild=y;
    y.leftChild=t2;
    y.setHeight(getmax(y.leftChild.getHeight(), y.rightChild.getHeight())+1);
    x.setHeight(getmax(x.leftChild.getHeight(), x.rightChild.getHeight())+1);

    return x;
   }


   



}