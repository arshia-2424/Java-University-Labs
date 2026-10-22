/**
 * Exception thrown when an invalid menu option is selected.
 */
public class InvalidOptionException extends Exception {

    /**
     * Creates an exception with a custom error message.
     *
     * @param message the reason why the option is invalid
     */
    public InvalidOptionException(String message) {
        super(message);
    }
}