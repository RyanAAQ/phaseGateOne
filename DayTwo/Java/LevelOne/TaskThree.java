import java.util.Scanner;

public class taskThree{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int numberOne = input.nextInt();
    
    System.out.print("Enter the second number: ");
    int numberTwo = input.nextInt();
    
    int sum = numberOne + numberTwo;
    
    System.out.printf("sum = %d", sum);
    }
}
   
