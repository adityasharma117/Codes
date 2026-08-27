class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] two = new int[2];
       HashMap<Integer, Integer> mpp = new HashMap<>();
       for(int i = 0; i < nums.length; i++){
        int more = target - nums[i];
        if(!mpp.containsKey(more)){
            mpp.put(nums[i],i);
        } 
        else{
            two[0] = i;
            two[1] = mpp.get(more);
        }                

       }
       return two;

        
    }
}