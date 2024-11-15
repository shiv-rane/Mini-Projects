package simpleemailapp;
import java.util.Random;
import java.util.Scanner;
class Email {
    String firstname;
    String lastname;
    String password;
    
    public Email(String firstname, String lastname) {
        this.firstname=firstname;
        this.lastname=lastname;
        System.out.println("Name Created: " + firstname + " " + lastname);
        
        String email = firstname.toLowerCase() + lastname.toLowerCase() + "@gmail.com";
        System.out.println("Email Generated: " + email);
       
        this.password = randompassword();
        System.out.println("Password Generated: " + this.password);
    }

    public String randompassword() {
        String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$";
        int pass_length = 8;
        char[] password = new char[pass_length];
        for(int i = 0; i<pass_length;i++){
            int rand = (int) (Math.random() * pass.length());
            password[i] = pass.charAt(rand);
        }
        return new String (password);
    }
   
    
    public void resetPassword() {
        Scanner read = new Scanner(System.in);
        System.out.println("Verify its you: ");
        String verify = read.nextLine();
        
        if(verify.equals(password)){
            System.out.println("Enter new password: ");
            String reset = read.nextLine();
            this.password=reset;
            System.out.println("Password has changed");
        }
        else{
            System.out.println("Invalid Password");
            System.out.println("Terminating Program");
        }
        read.close();
    }
}