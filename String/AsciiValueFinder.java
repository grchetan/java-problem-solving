public class AsciiValueFinder {
    public static void main(String[] args) {
        String inputString = "hello";
        // Get the character at a specific index (e.g., index 0 for 'h')
        char character = inputString.charAt(0);

        // Cast the character to an integer to get its ASCII value
        int asciiValue = (int) character;

        System.out.println("The character is: " + character);
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}