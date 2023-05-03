/**
 * this abstract class indicates basic ops and methods that will each of the tree classes 
 * will inherit 
 */

public interface IContactNodeOperations {
    public  ContactNode search(String firstName, String lastName);
    public  void addContact(String firstName, String lastName, String phoneNumber, String email, String address);
    public  void deleteContact(String firstName, String lastName);
    public  void updateContact(String firstName, String lastName, String phoneNumber, String email, String address);

    


}
