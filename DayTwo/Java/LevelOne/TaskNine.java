import java.util.Scanner;

public class taskSeven{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the price of the item: ");
    int price = input.nextInt();
    
    double tax = price * 0.10;
    double newPrice = price + tax;
    
    System.out.printf("The new price = %.2f", newPrice);
    }
}
   
