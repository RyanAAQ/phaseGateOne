import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MiniParkingLotTest{

    @Test
    public void testThatTheArrayIsCreasted(){
        
        int [] actual = MiniParkingLot.slots(0);
        int [] expected = new int[20];
        assertArrayEquals(actual, expected);
    }
    
    @Test
    public void testThatACarIsParked(){
        int [] expected = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int [] actual = MiniParkingLot.parking(expected[0]);
        assertArrayEquals(actual, expected);
    }
    
}
