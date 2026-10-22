
/**
 * Tests the ArrayProcessor and Menu classes.
 * Demonstrates Java exception handling.
 */
public class Driver {

    /**
     * Runs the test cases for Lab 4.
     *
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        ArrayProcessor ap = new ArrayProcessor();

        Menu menu = new Menu();

        int[] options = {1, 2, 5, 3, 0, -1};

        for (int opt : options) {
            try {
                menu.displayMenuOption(opt);
            } catch (InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }

        int len = ap.getArrayLength(
                new String[]{"one", "two", "three"}
        );
        System.out.println("Array length is " + len);
    }
}
