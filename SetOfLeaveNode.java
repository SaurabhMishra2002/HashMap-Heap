import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import org.w3c.dom.Node;

public class SetOfLeaveNode {
    static HashMap<Integer,ArrayList<Integer>> leavesMap = new HashMap<>();

    public static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;  
        }
    }

    public static int heigth(Node root){
        if(root == null){
            return 0;
        }

        int lh = heigth(root.left);
        int rh = heigth(root.right);


        int h = 1+ Math.max(lh, rh);

        // BASIC WAY (no computeIfAbsent)
        try {
            if (!leavesMap.containsKey(h)) {
                leavesMap.put(h, new ArrayList<Integer>());
            }

        leavesMap.get(h).add(root.data);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return h;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5); 
        
        ArrayList<Integer> leaves = new ArrayList<>();

        heigth(root);

        for(int key : leavesMap.keySet()){
            System.out.println("Height: " + key + " Leaves: " + leavesMap.get(key));
        }        
    }
}
