import java.util.Scanner;

public class taskFive{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the temperature in celcius: ");
    double celcius = input.nextInt();

    double fahrenheit = (9.0 / 5.0) * celcius + 32;
    
    System.out.printf("%.2fC = %.2fF", celcius, fahrenheit);
    }
}
   
