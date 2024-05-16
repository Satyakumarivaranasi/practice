public class CharIndex {
    public static void main(String[] args) {
        String str = "Banana";
        int index = str.indexOf('a'
        if (index != -1) {
            System.out.println("The index of the first occurrence of 'a' in \"" + str + "\" is: " + index);
        } else {
            System.out.println("The character 'a' is not found in the string \"" + str + "\".");
        }
    }
}
