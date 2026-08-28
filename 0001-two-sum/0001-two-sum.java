class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i = 0 ; i < nums.length; i++){
      int more = target - nums[i];
      if(!mpp.containsKey(more)){
        mpp.put(nums[i], i);
      }
      else{
        return new int[]{i, mpp.get(more)};
      }

        }
        return new int[]{};
    }
}