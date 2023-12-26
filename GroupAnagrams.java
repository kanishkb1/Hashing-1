
// Time Complexity : O(m*n) where m is number of strings and n is average length of strings
// Space Complexity : O(n) as hashmap is used
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :No
//Approach: We will use prime products for every string in the list. And if it is not already available, we will store in arraylist.




import java.util.ArrayList;
class GroupAnagrams {

    private int [] prime;
    public List<List<String>> groupAnagrams(String[] strs) {
        
        this.prime = new int[] {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};

        //edge cases
        if(strs==null || strs.length ==0){
            return new ArrayList<>();
        }

        //created hashmap to store output
        HashMap <Double, List <String>> map= new HashMap <>();
        for (String st:strs){
            double primeProduct = primeProduct(st);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<>());
            }
            map.get(primeProduct).add(st);
        }
        return new ArrayList<>(map.values());
    }

    //function to calculate the primeProduct for every string in list
    private double primeProduct(String s){
        double result = 1;
        for (int i=0;i<s.length();i++){

            char c = s.charAt(i);
            result = result*prime[c - 'a'];
        }
        return result;
    }
}