import java.util.Scanner;

public class TaskThree{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the score: ");
    int score = input.nextInt();
    
    if(score >= 50){
        System.out.print("Pass");
    }
    else{
        System.out.print("Fail");
    }
      
        
    }
}
