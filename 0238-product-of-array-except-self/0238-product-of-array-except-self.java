class Solution {
    public int[] productExceptSelf(int[] nums) {
                int prefix = 1;
                int postfix = 1;
        int[] arr = new int[nums.length];
        arr[0]=1;
        arr[nums.length-1]=1;
    

           for(int i = 0; i<nums.length-1; i++){
             prefix =  nums[i] * prefix;
             arr[i+1] = prefix;
           }
           for(int j= nums.length-1; j>0; j--){
             postfix =  nums[j] * postfix;
             arr[j-1] = arr[j-1]* postfix;
           }
            
        return arr;
    }
}