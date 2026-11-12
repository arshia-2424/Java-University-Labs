/**
 * Sorts integer arrays using two stacks.
 */
import java.util.Stack;
/**
 * Sorts and prints numbers in the chosen order.
 *
 * @param numbers the array of integers
 * @param ascending true for ascending, false for descending
 */
public class NumberSorter {

    public void sort(int[] numbers, boolean ascending) {

        Stack<Integer> srcStack = new Stack<>();
        Stack<Integer> destStack = new Stack<>();

        // Add all numbers to source stack
        for (int number : numbers) {
            srcStack.push(number);
        }

        // Sort using two stacks
        while (!srcStack.isEmpty()) {

            int next = srcStack.pop();

            while (!destStack.isEmpty() &&
                   (ascending
                   ? destStack.peek() > next
                   : destStack.peek() < next)) {

                srcStack.push(destStack.pop());
            }

            destStack.push(next);
        }

        // Print sorted numbers
        System.out.println(
            ascending ? "Ascending:" : "Descending:"
        );

        while (!destStack.isEmpty()) {
            System.out.print(destStack.pop() + " ");
        }

        System.out.println();
    }
}
