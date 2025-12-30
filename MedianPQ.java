import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class MedianPQ {
    public static class Median {
       PriorityQueue left;
       PriorityQueue right;


       public  void median(){
              left = new PriorityQueue<>(Collections.reverseOrder()); // Max-heap
              right = new PriorityQueue<>(); // Min-heap
       }

       public void add(int data){
         if(right.size() > 0 && data > (int) right.peek()){
            right.add(data);
         }else{
            left.add(data);
         }

         if(left.size() - right.size() == 2){
             right.add((int) left.remove());
         }

         if(right.size() - left.size() == 2){
            left.add(right.remove());
         }

       }

       public int remove(){
        if(this.size() == 0){
                System.out.println("underflow");
                return -1;
            }else if(left.size() >= right.size()){
                return (int) left.remove();
            }else{
                return (int) right.remove();
            }


       }

       public int peek(){
            if(this.size() == 0){
                System.out.println("underflow");
                return -1;
            }else if(left.size() >= right.size()){
                return (int) left.peek();
            }else{
                return (int) right.peek();
            }
}

       public int size(){
            return left.size() + right.size();
       }
        
    }

    public static void main(String[] args) {
        //MedianPQ m = new MedianPQ();
        Median median = new Median();
        median.median();  
        median.add(10);
        median.add(20);
        
        System.out.println(median.peek()); // Output: 10
        median.add(30);
        System.out.println(median.peek()); // Output: 20
        median.remove();
        System.out.println(median.peek()); // Output: 20
        median.remove();
        System.out.println(median.peek()); // Output: 20

    }
}
