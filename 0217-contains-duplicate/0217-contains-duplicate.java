class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean k = false;
        HashMap <Integer,Integer> mpp = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            if(!mpp.containsKey(nums[i])){
                mpp.put(nums[i],i);
            }
            else{ k = true; break;}

        }
        return k;
    }
}