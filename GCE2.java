import java.util.HashMap;
import java.util.Scanner;

public class GCE2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }


        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n1; i++) {
            if(!map.containsKey(arr1[i])){
                map.put(arr1[i], 0);
            }
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }

        for(int i = 0; i < n2; i++){
            if(map.containsKey(arr2[i])  && map.get(arr2[i]) > 0){
                System.out.println(arr2[i]);
                map.put(arr2[i], map.get(arr2[i]) - 1);
            }
 }

 }
}
