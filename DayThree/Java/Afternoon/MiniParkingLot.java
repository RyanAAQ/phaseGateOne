public class MiniParkingLot{
    public static void main(String[] args){
    
}  

    public static int [] slots(int slot){
        int [] slots = new int[20];
        
        return slots;
    } 
    public static int [] parking(int slot){
    int[] slots = new int[20];
    
    for (int i = 0; i < 20; i++) {
    if (slots[i] == 0) {
    slots[i] = 1;
    System.out.println("Car parked successfully at slot " + (i + 1));
    break;
        }
    }
  return slots;
}
}
