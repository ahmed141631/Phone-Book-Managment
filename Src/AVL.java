package Src;

import java.util.ArrayList;

public class AVL {
    String filename;
    public TreeNode root;
    ArrayList<ContactNode> contactNodeList;
    /* will extend this class and remove this object later */
    TreeAbstractClass obl;

    public AVL(){}
    public AVL(String filename){
        this.filename = filename;
        contactNodeList =obl.readContactsFromFile(filename);
        
    }

  /*
   * how to build Avl tree :
   * 
   */
}
