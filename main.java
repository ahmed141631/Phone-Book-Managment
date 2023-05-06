import Src.*;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("contacts.csv");
       
        tree.InorderTraversal(tree.root);
      //  System.out.println(tree.GetHeight(tree.root));
    }
}
