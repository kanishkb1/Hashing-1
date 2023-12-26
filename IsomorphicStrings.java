// Time Complexity : 
// Space Complexity : O(n) as hashmap is used
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We will use two hashmaps to iterate over character by character in both the string. If the key is not present in the hashmap, then add as key value pair. If the existing key does not match with value return False. 

// Your code here along with comments explaining your approach in three sentences only

import java.util.HashMap;
class IsomorphicStrings{
    public boolean isIsomorphic(String s, String t) {

        //edge cases
        if(s==null && t==null) return true;
        if (s==null || t== null) return false;
        if (s.length()!=t.length()) return false;
        
        //Two hashset
        HashMap<Character,Character> sMap = new HashMap <>();
        HashMap<Character,Character> tMap = new HashMap <>();

        for (int i=0;i<s.length();i++){
            char s_char = s.charAt(i);
            char t_char = t.charAt(i);

            if(!sMap.containsKey(s_char)){
                sMap.put(s_char,t_char);
            }

            else{
                if(sMap.get(s_char)!=t_char){
                    return false;
                }
            }

            if(!tMap.containsKey(t_char)){
                tMap.put(t_char,s_char);
            }

            else{
                if(tMap.get(t_char)!=s_char){
                    return false;
                }
            }
        }
      
        return true;

    }
}