import java.util.Scanner;

public class TwoSum{
    public static int [] returnArray(int [] numbers, int target){
        int[] total = {}; 
        
    for (int number = 0; number < numbers.length; number++){
        for (int next = number + 1; next < numbers.length; next++){
        
    if (numbers[number] + numbers[next] == target){
        total = new int[]{numbers[number], numbers[next]}; 
    return total;
        }
    }
}
    return total;
}

}

