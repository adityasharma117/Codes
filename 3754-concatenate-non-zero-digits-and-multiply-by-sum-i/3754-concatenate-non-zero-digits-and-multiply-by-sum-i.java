class Solution {
    public long sumAndMultiply(int n) {
        if(n==0){return 0;}
        long k = 0;

        int sum = 0;
        int r = -1;
        int i = 1;
        while(n>0){
             if(n%10!=0){            
                 r=n%10;
                 sum+=r;
                k+= (r*i);
                i*=10;
             }      

            n=n/10;
        }
       
        return (long)k *sum;
    }
}