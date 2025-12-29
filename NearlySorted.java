import java.util.PriorityQueue;
import java.util.Scanner;

public class NearlySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       int arr[] = new int[n];

        int k = 3; // Example: k is given as 3

        for(int i = 0; i < n; i++){
           // int size = sc.nextInt();
            arr[i] = sc.nextInt();
        }


        PriorityQueue <Integer> pq = new PriorityQueue<>();

        for(int i = 0 ; i <= k ; i++){
            pq.add(arr[i]);
        }


        for(int  i = k+1; i < arr.length ; i++){
            System.out.println(pq.poll());
            pq.add(arr[i]);
        }
        
        while(pq.size() > 0){
            System.out.println(pq.poll());
        }
    }
}
