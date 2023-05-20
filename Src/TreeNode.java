package Src;

import java.util.LinkedList;

public class TreeNode {
  protected  ContactNode data;
  protected  TreeNode rightChild;
  protected  TreeNode leftChild;
  protected LinkedList<TreeNode>children;
  protected  TreeNode parent;
  protected int height;

  public TreeNode(){}
  public TreeNode(ContactNode data, TreeNode parent, TreeNode rightChild,TreeNode leftChild) {
    this.data = new ContactNode(data);
    this.parent = parent;
    this.rightChild = rightChild;
    this.leftChild = leftChild;
    this.parent=parent;
    this.children=new LinkedList<>();
    this.height=0;
  }

  public TreeNode(ContactNode data){
    data=
    this.data = new ContactNode(data);
    this.children=new LinkedList<>();
    this.rightChild=new TreeNode();
    this.leftChild=new TreeNode();
    height=0;
  }

  public TreeNode(String firstName, String lastName, String phoneNumber, String email, String address){
    this.data=new ContactNode(firstName,lastName,phoneNumber,email,address);

  }
  public void setData(String firstName, String lastName, String phoneNumber, String email, String address){
   this.data=new ContactNode(firstName,lastName,phoneNumber,email,address);
   
  }

  public void getData(){
         data.get_info();
  }
  

  public void addchild(TreeNode child){
    child.setParent(this);
    this.children.add(child);
  }

  public LinkedList<TreeNode> getChildren(){
    return this.children;
  }

  public void setParent(TreeNode parent){
    this.parent = parent;
  }

  public TreeNode getParent(){return this.parent;}

  public void setHeight(int height){
    this.height = height;
  }

  public int getHeight(){return this.height;}
  


}
