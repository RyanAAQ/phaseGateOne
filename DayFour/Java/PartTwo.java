import java.util.Arrays;

public class PartTwo{
public static int[] duplicates(int[] numbers) {

    int[] newArray = new int[numbers.length - 1];
    
    int count = 0;
    for (int number = 0; number < numbers.length; number++){
        for(int next = number + 1; next < numbers.length; next++)
        if (number == next) {
            continue; 
        }
        newArray[count] = numbers[number];
        count++;
    }
    
    return newArray;
}

public static int [] sorted(int [] numbers){  
    int minimum = 100000;
    numbers[0] = minimum;
    
    for(int number : numbers){
        if(number < minimum){
            minimum = number;
        }
    }
    return minimum;
    int maximum = 0;
    numbers[0] = maximum;
    
    for(int number : numbers){
        if(number > maximum){
            maximum = number;
        }
    }  
    
}
}
