public class ReverseString {
    public static void main(String[] args) {
        String str = "friends forever";
        System.out.println("Original string: " + str);
        
        char[] charArray = str.toCharArray();
        reverseString(charArray);
        
        String reversedStr = new String(charArray);
        System.out.println("Reversed string: " + reversedStr);
    }
    
    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
    }
}
