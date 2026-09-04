class Solution {
    public boolean isPalindrome(String s) {
        int l = 0;
        String dummy="";
        int dumy=0;
        while(dumy<s.length()){
            char ch = s.charAt(dumy);
            if(Character.isLetterOrDigit(ch)){dummy+=ch;}
            dumy++;
        
        }
        int high = dummy.length()-1;
        dummy = dummy.toLowerCase();
         
        System.out.println(dummy);
        while(l<high){
            if(dummy.charAt(l)!=dummy.charAt(high)){
                return false;
            }
                l++;
                high--;
        }
        return true;
    }
}