public class SubstringCheck {
    public static void main(String[] args) {
        String mainString = "Java Programming";
        String subString = "Programming";
        boolean containsSubstring = mainString.contains(subString);

        // Print the result
        if (containsSubstring) {
            System.out.println("The string \"" + mainString + "\" contains the substring \"" + subString + "\".");
        } else {
            System.out.println("The string \"" + mainString + "\" does not contain the substring \"" + subString + "\".");
        }
    }
}
