class Solution {
    public int strStr(String s, String r) {
        int l = r.length();
     
        for(int i = 0; i <= s.length() - l; i++){
          if(s.charAt(i)==r.charAt(0)){
        
           String a=s.substring(i,i+l);
            if(a.equals(r)){
                 return i;
            }            
          }

        }
        return -1;
    }
}