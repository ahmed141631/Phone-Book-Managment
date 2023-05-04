import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {
    
    public static void main(String[] args) {
        String csvFile = "addresses.csv";
        String line;
        String delimiter = ",";
        List<ContactNode> contactList = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] fields = line.split(delimiter);
                // Create a new ContactNode object with the data from the CSV file
                ContactNode contactNode = new ContactNode(fields[0], fields[1], fields[2], fields[3], fields[4]);
                // Add the ContactNode object to the list
                contactList.add(contactNode);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Print the information for each contact in the list
        for (ContactNode contactNode : contactList) {
            contactNode.get_info();
        }
    }
}