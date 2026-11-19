import java.util.Set;
import java.util.HashSet;
/**
 * Stores unique email addresses using a HashSet.
 * Provides methods to add, check and display emails.
 */
public class EmailStore {
    private Set<String> emailAddresses = new HashSet<String>(); 
    public boolean addEmail(String email) {
        return emailAddresses.add(email);
    }
         
    public boolean hasEmail(String email) {
        return emailAddresses.contains(email);
    }
    public void displayEmails() {
        for (String email : emailAddresses) {
            System.out.println(email);
        }
    }
 
}

