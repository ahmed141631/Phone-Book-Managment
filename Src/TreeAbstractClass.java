package Src;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * This abstract class contains shared attributes and methods for AVL and Heap trees.
 */
public abstract class TreeAbstractClass {

    protected int size;

    
  

    /**
     * Computes the height of the tree rooted at the given node.
     * @param node the root of the tree
     * @return the height of the tree
     */
    public int getHeight(TreeNode node) {
        if (node == null) {
            return -1;
        }
        int leftHeight = getHeight(node.leftChild);
        int rightHeight = getHeight(node.rightChild);
        return Math.max(leftHeight, rightHeight) + 1;
    }

    /**
     * Traverses the tree in-order and prints the data of each node.
     * @param root the root of the tree
     */
    public void inorderTraversal(TreeNode root) {
        if (root == null) {
            
            return;
        }
        inorderTraversal(root.leftChild);
        root.getData();
        inorderTraversal(root.rightChild);
    }

    /**
     * Displays the tree in a user-readable format.
     */
    public  void showTree(){
        // TODO Auto show the tree
    }
    public int getsize() { return this.size;}

    /* make method  to return a list of lines(contactNode) from the csv file and use it in the
 * build method
   */

  
public ArrayList<ContactNode> readContactsFromFile(String filename) {
    ArrayList <ContactNode> contacts = new ArrayList<>();
 
     try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
         String line;
         while ((line = br.readLine()) != null) {
             String[] columns = line.split(",");
             // if (columns.length == 5) {
             //     continue; // Skip lines with invalid format
             // }
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