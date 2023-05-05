import Src.*;

public class main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree("contacts.csv");
        tree.Build();
        tree.InorderTraversal(tree.root);
    }
}
