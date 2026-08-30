class Solution {
    public boolean containsDuplicate(int[] nums) {
        boolean k = false;
        HashSet <Integer> mpp = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(mpp.contains(nums[i])){
                return true;
            }
            mpp.add(nums[i]);            

        }
        return false;
    }
}