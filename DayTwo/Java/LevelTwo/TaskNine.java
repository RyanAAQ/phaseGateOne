import java.util.Scanner;

public class TaskNine{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter your age: ");
    int age = input.nextInt();
    
    if(age <= 12){
        System.out.println("You are a child");
    }
    else if(age <= 19){
        System.out.println("You are a teen");
    }
    else{
        System.out.print("You are an adult");
    }
    }
}
