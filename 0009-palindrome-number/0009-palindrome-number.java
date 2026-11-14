class Solution {
    public boolean isPalindrome(int x) {
        int l = x;
        int a = 0;
        while(l>0){
            a = a*10 +(l%10);
            l=l/10;
        }
      
        return(a==x);
    }
}