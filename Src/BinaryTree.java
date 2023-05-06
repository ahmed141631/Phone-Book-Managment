package Src;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;



public class BinaryTree extends TreeAbstractClass {
   public TreeNode root;
   public String filename;
   public int count ;
   ArrayList<ContactNode>contactNodes;

   



   public BinaryTree(){
    count = 0;
    this.root=new TreeNode();
    
   }
   public BinaryTree(String filename){
    count = 0;
   
    this.filename = filename;
   this.contactNodes=readContactsFromFile();
    this.root = Build();
    
        //GetHeight(root);
       // showTree();
   }

@Override
  public TreeNode Build() {

    if(count==this.contactNodes.size()) return null;
    
   TreeNode newnode=new TreeNode();
   newnode.data=this.contactNodes.get(count++);

   //left child node
   newnode.leftChild=Build();
   newnode.rightChild=Build();
   
   return newnode;
}

@Override
public int GetHeight(TreeNode root) {
    TreeNode temp=this.root;
    int left_height;
    int right_height;
    if(temp==null) return -1;
   
    left_height=GetHeight(temp.leftChild);
    right_height=GetHeight(temp.rightChild);
    
    return Math.max(left_height, right_height)+1;
}

@Override
public void InorderTraversal(TreeNode root) {
    TreeNode temNode = root;
    if(temNode==null) {
        //System.out.println("i amm in ");
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




/* make method  to return a list of lines(contactNode) from the csv file and use it in the
 * build method
   */

  
public ArrayList<ContactNode> readContactsFromFile() {
   ArrayList <ContactNode> contacts = new ArrayList<>();

    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] columns = line.split(",");
            if (columns.length != 4) {
                continue; // Skip lines with invalid format
            }
            String[] names = columns[0].split(" ");
            ContactNode contactNode;
            if (names.length == 1) {
                contactNode = new ContactNode(names[0], " ", columns[1], columns[2], columns[3]);
            } else {
                contactNode = new ContactNode(names[0], names[1], columns[1], columns[2], columns[3]);
            }
            contacts.add(contactNode);
        }
    } catch (FileNotFoundException e) {
        System.err.println("File not found: " + filename);
    } catch (IOException e) {
        e.printStackTrace();
    }

    return contacts;
}

}