package simpleemailapp;
import java.util.Scanner;
public class Main{
    public static void main(String[] args){ 
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter you Name: ");
        String firstname = scan.nextLine();
        
        System.out.println("Enter your last name: ");
        String lastname = scan.nextLine();
        
        Email em = new Email(firstname,lastname);
        
        System.out.println("Do you want to reset password: (y/n)");
        String choice = scan.nextLine();
        
        if(choice.equalsIgnoreCase("y")){
            em.resetPassword();
        }
        else if(choice.equalsIgnoreCase("n")){
            System.out.println("Terminating program");
        }
        scan.close();
    }
}