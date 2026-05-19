import java.util.Scanner;

public class taskSeven{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the radius: ");
    double radius = input.nextInt();
    
    double circumference = 2 * (22 / 7) * radius;
    
    System.out.printf("The circumference = %.2f", circumference);
    }
}
   
