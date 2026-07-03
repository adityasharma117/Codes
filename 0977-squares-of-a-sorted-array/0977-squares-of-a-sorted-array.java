class Solution {
    public int[] sortedSquares(int[] nums) {

        int left = 0;
        int right = nums.length - 1;
        int[] arr = new int[nums.length];
        int index = arr.length -1 ;
        while(left<=right){
             
             if(Math.abs(nums[left])>Math.abs(nums[right])){
                arr[index]=(int) Math.pow(nums[left],2);
                index--;
                left++;
             }
             else{
                arr[index]=(int) Math.pow(nums[right],2);
                index--;
                right--;
             }

        }
       

return arr;
}

}