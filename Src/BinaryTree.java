// package Src;

// import java.io.BufferedReader;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
// import java.io.IOException;
// import java.util.ArrayList;
// import java.util.LinkedList;



// public class BinaryTree extends TreeAbstractClass  implements IContactNodeOperations{
//    public TreeNode root;
//    public String filename;
//    public int count ;
//    ArrayList<ContactNode>contactNodes;

   



//    public BinaryTree(){
//     count = 0;
//     this.root=new TreeNode();
    
//    }
//    public BinaryTree(String filename){
//     count = 0;
   
//     this.filename = filename;
//    this.contactNodes=readContactsFromFile();
//    this.size=contactNodes.size();
//     this.root = build();
//     inorderTraversal(root);
//     System.out.println(getsize());
    
//         //GetHeight(root);
//        // showTree();
//    }

// @Override
//   public TreeNode build() {

//     if(count==this.contactNodes.size()) return null;
    
//    TreeNode newnode=new TreeNode();
//    newnode.data=this.contactNodes.get(count++);

//    //left child node
//    newnode.leftChild=build();
//    newnode.rightChild=build();
   
//    return newnode;
// }

// // @Override
// // public int GetHeight(TreeNode root) {
// //     // the code assumes that the binary tree is a valid binary tree
// //     TreeNode temp=this.root;
// //     int left_height;
// //     int right_height;
// //     if(temp==null) return -1;
   
// //     left_height=GetHeight(temp.leftChild);
// //     right_height=GetHeight(temp.rightChild);
    
// //     return Math.max(left_height, right_height)+1;
// // }

// // @Override
// // public void InorderTraversal(TreeNode root) {
// //     TreeNode temNode = root;
// //     if(temNode==null) {
// //         //System.out.println("i amm in ");
// //         return;
// //     }

// //     InorderTraversal(temNode.leftChild);
// //     temNode.getData();
// //     InorderTraversal(temNode.rightChild);
    
// // }


  







// /* make method  to return a list of lines(contactNode) from the csv file and use it in the
//  * build method
//    */

  
// // public ArrayList<ContactNode> readContactsFromFile() {
// //    ArrayList <ContactNode> contacts = new ArrayList<>();

// //     try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
// //         String line;
// //         while ((line = br.readLine()) != null) {
// //             String[] columns = line.split(",");
// //             // if (columns.length == 5) {
// //             //     continue; // Skip lines with invalid format
// //             // }
// //             String[] names = columns[0].split(" ");
// //             ContactNode contactNode;
// //             if (names.length == 1) {
// //                 contactNode = new ContactNode(names[0], " ", columns[1], columns[2], columns[3]);
// //             } else {
// //                 contactNode = new ContactNode(names[0], names[1], columns[1], columns[2], columns[3]);
// //             }
// //             contacts.add(contactNode);
// //         }
// //     } catch (FileNotFoundException e) {
// //         System.err.println("File not found: " + filename);
// //     } catch (IOException e) {
// //         e.printStackTrace();
// //     }

// //     return contacts;
// // }

// /* i want to make method that will take first and second name or take one name
//  * and check if there are matches in the name
//  */

// public ContactNode search(TreeNode root,String firstName,String lastName) {
//     LinkedList<ContactNode> nodes = new LinkedList<ContactNode>();
//     TreeNode tempNode=this.root;
//     while(tempNode!=null){
//     if((tempNode.data.getFirstName().equals(firstName))&&(tempNode.data.getLastName().equals(lastName))){
//         //tempNode.getData();
//         nodes.add(tempNode.data);
//     }
//     tempNode=tempNode.leftChild;
    
// }
//     if(nodes.size()>1){
//         System.out.println("there are matches in the name u mentioned in the");
//     for(ContactNode node : nodes){
//         node.get_info();
//         System.out.println("----------------------------------------------------");
//     }}
   
//     return  null;
// }
// public ContactNode searchbyonename(TreeNode root,String name){
//     TreeNode tempNode=this.root;
//     while(tempNode!=null){
//     if((tempNode.data.getFirstName().equals(name)) || (tempNode.data.getLastName().equals(name))){
//         tempNode.getData();
//     }
//     tempNode=tempNode.leftChild;
    
// }
   
//     return  null;
// }
// @Override
// public void addContact(String firstName, String lastName, String phoneNumber, String email, String address) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'addContact'");
// }
// @Override
// public void deleteContact(String firstName, String lastName) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'deleteContact'");
// }
// @Override
// public void updateContact(String firstName, String lastName, String phoneNumber, String email, String address) {
//     // TODO Auto-generated method stub
//     throw new UnsupportedOperationException("Unimplemented method 'updateContact'");
// }

// }