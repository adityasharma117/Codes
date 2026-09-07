class Solution {
    public boolean ispalindrome(String s,int l, int high){
        while(l<high){
            if(s.charAt(l)!=s.charAt(high)){return false;}
            l++;
            high--;
        }
        return true;
    
    }
    public String longestPalindrome(String s) {
        String ss = "";
        if(s.length()==0){return "";}
    

        for (int low = 0; low < s.length(); low++) {
            for (int high = low; high < s.length(); high++) {
 
 
            String fina="";
            if(s.charAt(low)==s.charAt(high)){
            if(ispalindrome(s,low,high)){ fina=s.substring(low,high+1);}
          
            }else{
         
            }
            if(fina.length()>ss.length()){ss=fina;}
     
        }
    }
        return ss;
}
}
       
          
      

 
     
 
 