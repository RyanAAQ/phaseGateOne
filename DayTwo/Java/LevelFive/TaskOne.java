import java.util.Arrays;

public class TaskOne{
    public static void main(String... args){
       
    int [] numbers = {5, 9, 3, 6, 2};
    int [] numberss = {5, -9, 3, -6, -2};
    int [] sorted = sortedArray(numbers);
    int [] sorteds= negative(numberss);
    System.out.println(Arrays.toString(sorted));
    System.out.println(Arrays.toString(sorteds));
    }
    
    public static int [] sortedArray(int [] numbers){
    int count = 0;
    
    for(int number : numbers){
        if(isPrime(number))
        count++;
    }
    
    int [] array = new int[count];
    int counter = 0;
    
    for(int number : numbers){
        if(isPrime(number)){
            array[counter++] = number;
        }
    }
    return array;
}
public static int [] negative(int [] numbers){
    
    for(int index = 0; index < numbers.length; index++){
        if(numbers[index] < 0){
            numbers[index] = 0;
        }
    }
    return numbers;
}
    public static boolean isPrime(int number){
        if(number <= 1){
            return false;
        }
    
        for(int count = 2; count <= number / 2; count++){
            if(number % count == 0){
                return false;
            }
        }
        return true;
    }
}
