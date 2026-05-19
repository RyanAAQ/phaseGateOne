import java.util.Scanner;

public class TaskFour{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the first number: ");
    int numberOne = input.nextInt();
        
    System.out.print("Enter the second number: ");
    int numberTwo = input.nextInt();
    
    int largest = numberOne;
    
    if(numberTwo > largest){
        largest = numberTwo;    
    }
    
    System.out.print("The largest number = " + largest);

    }
}
