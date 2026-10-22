/**
 * Processes arrays using exception handling.
 */
public class ArrayProcessor {

    /**
     * Counts the elements of an array using a loop.
     *
     * @param a the array to be processed
     * @return the number of elements in the array
     */
    public int getArrayLength(Object[] a) {
        int count = 0;

        try {
            while (true) {
                // Access each element until the index is invalid
                Object t = a[count];
                count++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            // Return the number of successfully accessed elements
            return count;
        }
    }
}