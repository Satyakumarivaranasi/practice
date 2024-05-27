import java.util.Scanner;
public class additionoftwonumbers{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b=sc.nextInt();
        int sum=0;
        sum=a+b;
        System.out.println("the sum of two numbers is :  "+sum);
    }
}