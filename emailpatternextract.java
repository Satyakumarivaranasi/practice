import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmail {
    public static void main(String[] args) {
        String text = "Hey, there how are you? this is my email id great123@gmail.com";
        
        // Define the regex pattern for an email address
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}";
        
        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);
        
        // Create a matcher object
        Matcher matcher = pattern.matcher(text);
        
        // Find and print the email address
        if (matcher.find()) {
            System.out.println("Extracted email: " + matcher.group());
        } else {
            System.out.println("No email found in the given text.");
        }
    }
}
