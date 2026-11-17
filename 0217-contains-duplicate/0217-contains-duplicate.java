class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sat = new HashSet<>();
        for(int i = 0; i< nums.length; i++){
        if(sat.contains(nums[i])){
            return true;
        }
        sat.add(nums[i]);
                

        }
        return false;

    }
}