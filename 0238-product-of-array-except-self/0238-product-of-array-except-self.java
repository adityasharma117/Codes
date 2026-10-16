class Solution {
    public int[] productExceptSelf(int[] nums) {
                int prefix = 1;
                int postfix = 1;
        int[] arr = new int[nums.length];
        for(int j= nums.length-1; j>=0; j--){
          arr[j] = postfix;
           postfix *=  nums[j];
           }
           for(int i = 0; i<nums.length; i++){
           arr[i] =arr[i] * prefix;
           prefix =  nums[i] * prefix;
           }
            
        return arr;
    }
}