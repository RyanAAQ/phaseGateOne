import java.util.Scanner;

public class TaskTwo{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    if(number < 0){
        System.out.print("It is a negative number");
    }
    else{
        System.out.print("It is a positive number");
    }
        
        
    }
}
