/**
 * Represents a menu with three valid options.
 */
public class Menu {

    /**
     * Displays the selected menu option.
     *
     * @param opt the option selected by the user
     * @throws InvalidOptionException if opt is outside 1 to 3
     */
    public void displayMenuOption(int opt)
            throws InvalidOptionException {

        if (opt >= 1 && opt <= 3) {
            System.out.println("Menu option " + opt + " selected");
        } else {
            // Reject options outside the valid range
            throw new InvalidOptionException(
                "Option " + opt + " is invalid. Please select 1, 2 or 3."
            );
        }
    }
}