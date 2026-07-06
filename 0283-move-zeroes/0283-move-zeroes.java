class Solution {
    public void moveZeroes(int[] nums) {
        int s = 0;
        int e = 1;
        int temp = 0;
        while(s<e && e<nums.length){
            if(nums[s]==0){
                if(nums[e]!=0){
                    temp = nums[s];
                    nums[s] = nums[e];
                    nums[e]= temp;

                }
                else{e++;}}
            else{s++;e++;}
           
        
        }
        
    }
}