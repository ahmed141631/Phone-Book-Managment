package Src;
/**
 * this interface indicates basic ops and methods that will each of the tree classes 
 * will implement  
 */

public interface IContactNodeOperations {
    public  ContactNode search(String firstName, String lastName);
    public  void addContact(String firstName, String lastName, String phoneNumber, String email, String address);
    public  void deleteContact(String firstName, String lastName);
    public  void updateContact(String firstName, String lastName, String phoneNumber, String email, String address);




}
