/*import java.util.Stack;

public class StacknVector {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.add(54);
        list.add(65);
        list.add(76);
        list.add(76);
        list.add(42);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.capacity());
        System.out.println(list.set(2,23));
        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list.peek());
        System.out.println(list);
    }
}
*/
/*
import java.util.Vector;
public class StacknVector {
    public static void main(String[] args) {
        Vector<Integer> list = new Vector<>();
        list.add(54);
        list.add(65);
        list.add(76);
        list.add(76);
        list.add(42);
        System.out.println(list);
        System.out.println(list.get(3));
        System.out.println(list.capacity());
        System.out.println(list.set(2,23));
        System.out.println(list);
       // System.out.println(list.pop());
       // System.out.println(list.peek());
        System.out.println(list);
        System.out.println(list.remove(5));
    }
}
 */
/*
import java.util.Scanner; // Essential for reading user input

public class StacknVector {

    public static void main(String[] args) {
        // Create a Scanner object to read input from the console.
        // This is the fundamental way to get user input in Java.
        Scanner scanner = new Scanner(System.in);

        // --- Get the main number as a String ---
        System.out.print("Enter a whole number: ");
        String mainNumberString = scanner.nextLine(); // Reads the entire line of input as text

        // --- Get the single digit to count as a String ---
        System.out.print("Enter a single digit (0-9) to count: ");
        String digitToCountString = scanner.nextLine(); // Reads the input as text

        // Convert the single-digit String to a char for direct comparison.
        // 'charAt(0)' gets the first (and only) character from the string.
        char targetDigitChar = digitToCountString.charAt(0);

        // Initialize a counter variable.
        int count = 0;

        // --- Loop through each character of the 'mainNumberString' ---
        // This is a basic 'for' loop to iterate from the first character (index 0)
        // up to (but not including) the length of the string.
        for (int i = 0; i < mainNumberString.length(); i++) {
            // Get the character at the current position 'i'.
            // 'charAt(i)' is the basic way to access a character at a specific index in a string.
            char currentChar = mainNumberString.charAt(i);

            // Compare the current character with the target digit character.
            // '==' is the basic comparison operator for characters.
            if (currentChar == targetDigitChar) {
                count++; // Increment the counter. This is a basic arithmetic operation.
            }
        }

        // --- Print the final result ---
        // 'System.out.println()' is the fundamental way to print output to the console.
        System.out.println("The digit '" + targetDigitChar + "' appears " + count + " time(s) in the number " + mainNumberString + ".");

        // Close the scanner. (Good practice, even in simple programs).
        scanner.close();
    }
}*/