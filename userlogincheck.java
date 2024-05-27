import java.util.Scanner;
public class userlogincheck{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        boolean isLoggedin=false;
        System.out.println("enter your username: ");
        String Username=sc.nextLine();
        System.out.println("Enter your password: ");
        String Password=sc.nextLine();
        if(Username.equals("satya") && Password.equals("satya123")){
            isLoggedin=true;
        }
        if(isLoggedin){
            System.out.println("user successfully logged in");
        }
        else{
            System.out.println("failed to login. please enter correct details.");
        }
    
    }
}