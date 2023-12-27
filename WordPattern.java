// Time Complexity : O(n) 
// Space Complexity : O(n) as hashmaps are used
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We have used hashing technique. Used two hashmap to store the character and string mapping. If the new character-integer string-integer mapping is found at new index position, return false. 
import java.util.HashMap;
class WordPattern {
  public boolean wordPattern(String pattern, String str) {
    String[] words = str.split(" ");
    //edge case
    if (words.length != pattern.length())
      return false;


    //creating two hashmaps for character and string mapping from pattern and str respectively
    Map<Character, Integer> hashMap1 = new HashMap<>();
    Map<String, Integer> hashMap2 = new HashMap<>();

    // check if the put operation in hashMap1 (for characters) is equal to the put operation in hashMap2 (for words).
    //At any index, if the already existing character does not matches the word at current index value, then return false
    for (Integer i = 0; i < pattern.length(); i++)
      
      if (hashMap1.put(pattern.charAt(i), i) != hashMap2.put(words[i], i))
        return false;

    return true;
  }
}
