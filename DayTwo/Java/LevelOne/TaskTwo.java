import java.util.Scanner;

public class taskTwo{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("How old are you: ");
    int age = input.nextInt();
    
    int newAge = age + 5;
    
    System.out.printf("You wil be %d years old in 5 years", newAge);
    }
}
    
