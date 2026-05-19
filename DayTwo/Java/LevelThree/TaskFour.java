import java.util.Scanner;

public class TaskFour{
    public static void main(String... args){
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    int result = 0;
        
        for(int count = 1; count <= 12; count++){
        result = count * number;
            System.out.println(number +  " x " + count + " = " + result);
        }
    }
}
