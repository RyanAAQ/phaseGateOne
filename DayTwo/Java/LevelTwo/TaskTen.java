import java.util.Scanner;

public class TaskTen{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a number: ");
    int number = input.nextInt();
    
    if((number % 5 == 0) && (number % 3 == 0)){
        System.out.print("It is divisible by 5 and 3");
    }
    else{
        System.out.print("It is not divisible by 5 and 3");
    }
    }
}
