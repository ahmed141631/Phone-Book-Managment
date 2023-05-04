package Src;
/**
 * this class is representating the elements of the contact node that has firstname ,lastname
 * phone ,email and address
 */
public class ContactNode {
  private String firstName;
  private String lastName;
  private String phoneNumber;
  private String email;
  private String address;

    public ContactNode() {}
    public ContactNode(String firstName, String lastName, String phoneNumber, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.address = address;
    }
    public ContactNode(ContactNode contactNode){
        this.firstName = contactNode.firstName;
        this.lastName = contactNode.lastName;
        this.phoneNumber = contactNode.phoneNumber;
        this.email = contactNode.email;
        this.address = contactNode.address;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getLastName() {
        return this.lastName;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return this.address;
    }

    public void get_info(){
        System.out.println("First Name: " + this.firstName+"\tLast Name: "+this.lastName+"\tPhone Number: "+this.phoneNumber+"\tEmail: "+this.email+"\tAddress: "+this.address);
       
    }
}