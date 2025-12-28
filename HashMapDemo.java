import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        String str = "aabbbccccddddd";

        for(char c : str.toCharArray()){

            if( !charCountMap.containsKey(c)){
                charCountMap.put(c, 0);

            }


            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);       
        
        }

        for(char key : charCountMap.keySet()){
            System.out.println(key + ": " + charCountMap.get(key));
        }
    }
}
