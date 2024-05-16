import java.util.Scanner;
public class concatenatewithoutplusEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first string: ");
        String str1=scanner.next();
        System.out.println("enter your second string: ");
        String str2=scanner.next();
        StringBuilder sb=new StringBuilder();
        sb.append(str1).append(str2);
        String str3=sb.toString();
        System.out.println("the result string is "+str3);
    }
}