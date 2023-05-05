import Src.*;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.Build("contacts.csv");
        tree.InorderTraversal(tree.root);
    }
}
