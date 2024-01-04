import java.util.*;
public class StockSpan {
    public static void main(String[] args){
        StockSpanner s = new StockSpanner();
        int[] inp = {100,80,60,70,60,75,85};
        for (int i : inp) {
            System.out.print(s.next(i) + " ");
        }
    }
}
class StockSpanner {
    ArrayList<Integer> nums;
    public StockSpanner() {
        nums = new ArrayList<>();
    }

    public int next(int price) {
        nums.add(price);
        int z=nums.size()-1;
        while(z>0 && nums.get(z-1)<=price){
            z--;
        }
        return nums.size()-z;
    }
}