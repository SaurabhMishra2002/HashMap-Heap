import java.util.PriorityQueue;

public class PriorityQueue1 {

    public static void main(String[] args) {
        System.out.println("PriorityQueue class is defined.");
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int []Ranks = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        for (int rank : Ranks) {
            pq.add(rank);
        }

        while(!pq.isEmpty()) {
            System.out.println(pq.poll());
        }


    }
}