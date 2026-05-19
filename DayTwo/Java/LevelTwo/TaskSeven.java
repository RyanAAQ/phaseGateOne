import java.util.Scanner;

public class TaskSeven{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the password: ");
    String pass = input.next();
    
    if(pass.equals("admin123")){
        System.out.print("Correct password");
    } 
    else{
        System.out.print("Incorrect password");
    }
     
    }
}
