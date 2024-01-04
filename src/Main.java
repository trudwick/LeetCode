import java.util.*;
class Main {
    public static void main(String[] args){
        Main m = new Main();
        int[] inp = {73,74,75,71,69,72,76,73};
        int[] ret = m.dailyTemperatures(inp);
        System.out.println(Arrays.toString(ret));
    }
    public int[] dailyTemperatures(int[] temperatures) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int[] ret = new int[temperatures.length];
        pq.add(0);
        for(int z=1; z<ret.length; z++){
            int curTemp = temperatures[z];
            while(!pq.isEmpty() && temperatures[pq.peek()]<curTemp){
                ret[pq.peek()] = z-pq.peek();
                pq.remove();
            }
            pq.add(z);
        }
        return ret;
    }
}