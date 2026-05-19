import java.util.Scanner;

public class taskSix{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the length: ");
    double length = input.nextInt();
    
    System.out.print("Enter the width: ");
    double width = input.nextInt();
    
    double area = length * width;
    
    System.out.printf("The area = %.2f", area);
    }
}
   
