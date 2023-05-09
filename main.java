import Src.*;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("contacts.csv");
      ContactNode found = tree.search(tree.root, "Sophia","silva");
     
        /* make the strategy pattern in this project  */
    }
}
