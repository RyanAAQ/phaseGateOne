import java.util.Scanner;

public class taskThree{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int numberOne = input.nextInt();
    
    System.out.print("Enter the second number: ");
    int numberTwo = input.nextInt();
    
    System.out.print("Enter the second number: ");
    int numberThree = input.nextInt();
    
    int average = (numberOne + numberTwo + numberThree) / 3;
    
    System.out.printf("The average = %d", average);
    }
}
   
