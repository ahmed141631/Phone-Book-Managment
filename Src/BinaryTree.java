package Src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class BinaryTree extends TreeAbstractClass {
   public TreeNode root;
   public String filename;
  static String line="";
  static int count=0;
   

   public BinaryTree(){
    this.root=new TreeNode();
    
   }
   public BinaryTree(String filename){
   
    this.filename = filename;
    this.root = Build();
   // this.root.getData();
        //GetHeight(root);
       // showTree();
   }

@Override
public TreeNode Build() {
    System.out.println(++count);
    if(count==100) return null;
    //System.out.println("iam in build mode");
    ContactNode contactNode = getContactLine();
    if (contactNode == null) {
       // System.out.println("contactNode is null");
        return null;
    }
    TreeNode newnNode = new TreeNode(contactNode);
    //System.out.println("leftnode");
    newnNode.leftChild = Build();
    System.out.println("rightnode");
    newnNode.rightChild = Build();

    
    return newnNode;
}

@Override
public int GetHeight(TreeNode root) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'GetHeight'");
}

@Override
public void InorderTraversal(TreeNode root) {
    TreeNode temNode = root;
    System.out.println("i amm in ");
    if(temNode==null) {
        System.out.println("i amm in ");
        return;
    }

    InorderTraversal(temNode.leftChild);
    temNode.getData();
    InorderTraversal(temNode.rightChild);
    
}


  


@Override
public void showTree() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'showTree'");
}


/* make method  to return a line(contactNode) from the csv file and use it in the
 * build method
   */

   public ContactNode getContactLine() {
    ContactNode contactNode = new ContactNode();
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        if (line == null) {
            return null;
        }
        line = br.readLine();
        if (line == null) {
            return null;
        }

        String[] columns = line.split(",");
        if(columns.length!=4) return null;
        String[] names=columns[0].split(" ");
        if(names.length==1){
            contactNode.setData(names[0]," ", columns[1], columns[2], columns[3]);
           }else{
               contactNode.setData(names[0], names[1], columns[1], columns[2], columns[3]);
           }
        
    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + filename);
        return null;
    } catch (IOException e) {
        e.printStackTrace();
    }

    return contactNode;
}}