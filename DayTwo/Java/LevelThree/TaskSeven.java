import java.util.Scanner;

public class TaskSeven{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);

    int result = 0;
        
        for(int count = 1; count <= 5; count++){
        
            System.out.print("Enter a number: ");
            int number = input.nextInt();
            
        result += number;
        }
        System.out.println("The sum of the 5 numbers = " + result);
    }
}
