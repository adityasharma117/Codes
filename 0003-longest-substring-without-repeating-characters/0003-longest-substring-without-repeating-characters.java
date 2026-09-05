class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int low = 0;
        int high = 0;
        int max = 0;
        while(high<s.length()){
            if(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }else{
            set.add(s.charAt(high));
            high++;
            max = Math.max(max,high-low );}
        }
    return max;
        
    }
}