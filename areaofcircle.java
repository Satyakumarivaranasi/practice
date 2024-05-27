import java.util.Scanner;
public class areaofcircle{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        if(user.equals("YES")){
            System.out.println("enter the radius: ");
            double radius=sc.nextInt();
            double areaofcircle = Math.PI * radius * radius;
            System.out.println("the area of circle is: "+areaofcircle);
        }
        else{
            System.out.println("sorry enter the yes or else you wont get areaofcircle.");
        }
    }
}