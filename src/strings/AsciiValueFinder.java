public class AsciiValueFinder {
    public static void main(String[] args) {
        String inputString = "hello";

        char character = inputString.charAt(0);

  
        int asciiValue = (int) character;

        System.out.println("The character is: " + character);
        System.out.println("The ASCII value of '" + character + "' is: " + asciiValue);
    }
}