public class MiniParkingLot{
    public static void main(String[] args){
    
}  

    public static int [] slots(int slot){
        int [] slots = new int[20];
        
        return slots;
    } 
    public static int [] parking(int slot){
    int[] slots = new int[20];
    
    for (int slote = 0; slote < 20; slote++) {
    if (slots[slote] == 0) {
    slots[slote] = 1;
    System.out.println("Car parked successfully at slot " + (slote + 1));
    break;
        }
    }
  return slots;
}
}
