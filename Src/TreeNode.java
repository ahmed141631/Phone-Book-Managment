package Src;

public class TreeNode {
  protected  ContactNode data;
  protected  TreeNode parent;
  protected  TreeNode rightChild;
  protected  TreeNode leftChild;

  public TreeNode(){}
  public TreeNode(ContactNode data, TreeNode parent, TreeNode rightChild,TreeNode leftChild) {
    this.data = data;
    this.parent = parent;
    this.rightChild = rightChild;
    this.leftChild = leftChild;
  }

  public TreeNode(String firstName, String lastName, String phoneNumber, String email, String address){
    this.data=new ContactNode(firstName,lastName,phoneNumber,email,address);

  }
  public void setData(String firstName, String lastName, String phoneNumber, String email, String address){
   this.data=new ContactNode(firstName,lastName,phoneNumber,email,address);
  }

  public void getData(){
         data.get_info();;
  }


}
