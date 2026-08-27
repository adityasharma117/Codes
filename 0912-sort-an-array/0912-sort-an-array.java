class Solution {
    public void merge(int[] arr, int low, int mid, int high){
        int i = low;
        int j = mid + 1;
        int k = low;
        int[] temp = new int [arr.length];
        while(i<=mid && j<=high){
            if(arr[i]<arr[j]){
                temp[k] = arr[i];
                i++;
            }
            else{ temp[k] = arr[j];j++;}
            k++;
        }
        for(;i<=mid;i++){
            temp[k]=arr[i];
            k++;
        }
        for(;j<=high;j++){
            temp[k]=arr[j];
            k++;
        }
        for(int l = low; l<=high; l++){
            arr[l] = temp[l];
        }
    }
    public void mergesort(int[] arr, int low, int high){
        if(low<high){
            int mid = low + (high-low) / 2;
            mergesort(arr, low, mid);
            mergesort(arr, mid+1, high);
            merge(arr, low, mid, high);
        }
    }


    public int[] sortArray(int[] nums) {
        mergesort(nums, 0, nums.length - 1);
        return nums;
    }
}