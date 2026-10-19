class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> lst = new ArrayList<>();
        int smaller = 0; 
        int equal = 0;
        for(int x: nums){
            if(x<target){
                smaller++;
            }
            else if(x==target){
                equal++;
            }
        }
        for(int i = smaller; i < smaller+equal; i++){
            lst.add(i);
        }

        return lst;
    }
 
}