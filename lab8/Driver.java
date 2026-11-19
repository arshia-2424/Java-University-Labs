
/**
 * Tests the functionality of the EmailStore class.
 */

public class Driver {
    public static void main(String[] args) {
        EmailStore store = new EmailStore();
        System.out.println(store.addEmail("ash@gmail.com"));
        System.out.println(store.addEmail("Chris@gmail.com"));
        System.out.println(store.addEmail("ash@gmail.com"));
        System.out.println("Checking email:");
        System.out.println(store.hasEmail("ash@gmail.com"));
        System.out.println(store.hasEmail("rishit@gmail.com"));
        System.out.println("All stored emails:");
        store.displayEmails();

    }
}