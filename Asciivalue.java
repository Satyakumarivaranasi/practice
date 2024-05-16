import java.util.Scanner;
public class ASCIIexample{
    public static void main(String args[]){
        System.out.println("Enter a character: ");
        Scanner c1=new Scanner(System.in);
        char c2=c1.next().charAt(0);
        int asciivalue=(int) c2;
        System.out.println("ASCII value of '" + c2 + "' is: " + asciivalue);

    }
}