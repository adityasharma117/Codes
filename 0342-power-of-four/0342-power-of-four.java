class Solution {
    public boolean isPowerOfFour(int n) {
        return (n< Integer.MAX_VALUE&& n>Integer.MIN_VALUE) && (n & 0x55555555)!=0 && n> 0 && (n&(n-1))==0 ;
    }
}