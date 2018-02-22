package repeat;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class DuplicateCharacter {
        //function to find duplicate characters
        public static void findDuplicateChars(String str){
        //Creating an object of type HashMap
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        //Convert the input string into a character array
        char[] chrs = str.toCharArray();
        //Parse each character of this array to update the count
        for(Character ch:chrs){
            //If character is already present in the Map, update the count to +1
            if(dupMap.containsKey(ch)){
                dupMap.put(ch, dupMap.get(ch)+1);
            } else {
                //Else insert the character in Map with initial value - 1
                dupMap.put(ch, 1);
            }
        }
        //Initialize a Set to read the HashMap populated above
        Set<Character> keys = dupMap.keySet();
        //Parse each character within the Set
        for(Character ch:keys){
            //If count value of character is greater than 1, print it.
            if(dupMap.get(ch) > 1){
                System.out.println(ch+"--->"+dupMap.get(ch));
            }
        }
    }
    public static void main(String a[]){
        findDuplicateChars("Java2Novice");
    }
}