import java.util.Scanner;

public class TaskFive{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    int result = 0;
    
    int number = 1;
    
while(number != 0){
        
    System.out.print("Enter a number: ");
    number = input.nextInt();
    
        result += number;
        }
    System.out.println("The sum = " + result);
}
}
