public class LevelFour{
    public static void main(String... args){

    System.out.println(isPrime(3));
    System.out.println(add(1, 2));
    System.out.println(converter(100));
    System.out.println(getLargest(10, 20, 30));    
    System.out.println(simpleInterest(1000, 0.10, 12));  
    System.out.print(reverse(123));
}
    public static int add(int numberOne, int numberTwo){
        return numberOne + numberTwo;
    }
    
    public static boolean isEven(int number){
        if(number % 2 == 0){
            return true;
        }
        return false;   
    }
    
    public static int square(int number){
        return number * number;
    }
    
    public static double converter(double celcius){
        return (9.0 / 5.0) * celcius + 32;
    }
    
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
    
        for(int count = 2; count <= number; count++){
            if(number % count == 0){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    
    public static int getLargest(int numberOne, int numberTwo, int numberThree){
        int largest = numberOne;
        
        if((numberTwo > numberOne) && (numberTwo > numberThree)){
            largest = numberTwo;
        }
        else if((numberThree > numberOne) && (numberThree > numberTwo)){
            largest = numberThree;
        }
        return largest;
    }
    
    public static double simpleInterest(int principal, double rate, int time){
        return (principal * rate * time) / 100;
    }
    
    public static double area(double length, double width){
        return length * width;
    }
    
    public static int reverse(int number){
    int reversed = 0;
    
    while(number > 0){
        reversed = reversed * 10 + number % 10;
        number /= 10;
    }
    return reversed;
  }  
//     public static int occurence(String word, char letter){
//        int count = 0;
//        
//        for(int counter = 0; counter < word.length; counter++){
//            if (word.charAt(counter) == letter)
//            count++;
//        }
//        return count;
//     }   
}

