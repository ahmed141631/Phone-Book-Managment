package Src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class BinaryTree extends TreeAbstractClass {
   public TreeNode root;
   static  String line;

   public BinaryTree(){
    this.root=new TreeNode();
   }
   public BinaryTree(String filename){
    this.root=new TreeNode();

      this.root=Build(filename);
        
        //GetHeight(root);
       // showTree();
   }

@Override
public TreeNode Build(String filename) {

    TreeNode newnNode=new TreeNode();
    
    try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
       
       
        line = br.readLine();
        
            String[] columns = line.split(",");
            String[] names=columns[0].split("");
            if(names.length==1){
             newnNode.setData(names[0],"hi", columns[1], columns[2], columns[3]);
            }else{
                newnNode.setData(names[0], names[1], columns[1], columns[2], columns[3]);
            }
          //  newnNode.getData();

            line = br.readLine();
        
            String[] columnss = line.split(",");
            String[] namess=columns[0].split("");
            newnNode.leftChild=new TreeNode(columnss[0], namess[0], columnss[1], columnss[2], columnss[3]);
           // newnNode.leftChild.getData();
            line = br.readLine();
        
            String[] columnsss = line.split(",");
            String[] namesss=columns[0].split("");
            newnNode.rightChild=new TreeNode(columnsss[0], namesss[0], columnsss[1], columnsss[2], columnsss[3]);
         //   newnNode.rightChild.getData();
            
            //temp.get_info();
        
        
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    root=newnNode;
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

    if(temNode==null) {
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

}