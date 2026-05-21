import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TwoSumTest{
    @Test
    public void testThatTheArrayisreturnedCorrectResult(){
        
        int [] numbers = {1, 2, 3, 4, 5};
        int target = 6;
        int [] actual = TwoSum.returnArray(numbers, target);
        int [] expected = {1, 5};
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatItCanTakeMoreThanFiveNumbers(){
    
        int [] numbers = {1, 2, 5, 7, 6, 8, 9};
        int target = 12;
        int [] actual = TwoSum.returnArray(numbers, target);
        int [] expected = {5, 7};
        assertArrayEquals(actual, expected);
    
    }
}
