import java.util.Scanner;
public class arthimeticoperators{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a: ");
        double a=sc.nextInt();
        System.out.println("enter the value of b: ");
        double b=sc.nextInt();
        double result;
        //addition
        result=a+b;
        System.out.println("The sum of " + a + " and " + b + " is: " + result);
        //mutliplying
        result=a*b;
        System.out.println("the multiplication of "+a+"and"+b+"is: "+result);
        //subtracting
        result=a-b;
        System.out.println("the subtraction of " +a +" and "+b+" is: "+result);
        //division
        result=a/b;
        System.out.println("the division of"+a+"and"+b+"is: "+result);
    }
}