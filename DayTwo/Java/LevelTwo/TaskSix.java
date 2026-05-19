import java.util.Scanner;

public class TaskSix{
    public static void main(String... args){
        
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter a year: ");
    int year = input.nextInt();
    
    if((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)){
        System.out.print("It is a leap year");
    }
    else{
        System.out.print("It is not a leap year");
    }
    }
}
