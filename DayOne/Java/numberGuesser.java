import java.util.Random;
import java.util.Scanner;

public class numberGuesser{
    public static void main(String... args){
     
    Scanner input = new Scanner(System.in);
    Random rand = new Random();
    
    int number = rand.nextInt(100);
    int guess = 0;
    int attempts = 0;
    String rating = "BETTER LUCK";
    
while (attempts < 5) {
    System.out.print("Enter your guess: ");
    guess = input.nextInt();
    attempts++;
  
    if((guess < 1) || (guess > 100)){
        System.out.println("Invalid number, Choose between 1-100 ");
        attempts = 0;
    }
    
    
 if (guess == number) {
    System.out.println("You are correct!!");
        break; 
        
    }else if(guess < number){
        System.out.println("Higher!");
        
    }else{
        System.out.println("Lower!");
            }
        }
    if(attempts == 1){
        rating = "LEGENDARY";
    }
    
    else if(attempts == 2){
        rating = "EXCELLENT";
    }
    
    else if(attempts == 3){
        rating = "GOOD";
    }

    else if(attempts == 4){
        rating = "GOOD";
    }
    
    else if(attempts == 5){
        rating = "CLOSE";
}
     
    System.out.println("The correct number is " + number);
    System.out.println("Your rating is " + rating);
    System.out.println("Number of attempts are " + attempts);
    }
}
