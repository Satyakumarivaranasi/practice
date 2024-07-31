public class UniqueCharacter {
    public static int firstUniqChar(String s) {
        int flag = 0;
        for (int i = 0; i < s.length(); i++) {
            flag = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                return i;//return i for non repeated characters.
            }
        }
        return -1;//their is no non repeated chars
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("aabb"));
    }
}
