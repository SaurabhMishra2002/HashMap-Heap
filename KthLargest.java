import java.util.PriorityQueue;
import java.util.Scanner;

public class KthLargest {
    public static void main(String[] args) {
        System.out.println("KthLargest class is defined.");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        int k = 3; // Example: Find the 3rd largest element

        for(int i = 0; i < n; i++){
           // int size = sc.nextInt();
            arr[i] = sc.nextInt();
        }

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for(int j = 0; j < arr.length; j++){
            if(j < k){
                minHeap.add(arr[j]);
            }else{
                if(arr[j] > minHeap.peek()){
                    minHeap.poll();
                    minHeap.add(arr[j]);
                }
            }
        }

        while(!minHeap.isEmpty()){
            System.out.println(minHeap.poll());
    }
}
}
