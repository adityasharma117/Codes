class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){return 0;}
        long k = 0;
        long kk = 0;
        int sum = 0;
        int r = -1;
        while(n>0){
             if(n%10!=0){            
                 r=n%10;
                 sum+=r;
                k = (k*10)+r;
             }      

            n=n/10;
        }
        while(k>0){
            long rr = k%10;
            kk = (kk*10)+rr;
            k=k/10;
        }
        return kk*sum;
    }
}