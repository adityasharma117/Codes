class Solution {
public static void mergesort(int[] arr, int low, int high){
     
    if(low<high){
        int mid = low+(high-low) / 2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
} 
    public static void merge(int[] a, int low, int mid, int high)
{
    int i = low;
    int j = mid + 1;
    int k = low;

    int[] c = new int[a.length];

    while (i <= mid && j <= high) {
        if (a[i] < a[j]) {
            c[k] = a[i];
            i++;
        }
        else {
            c[k] = a[j];
            j++;
        }
        k++;
    }

    for (; i <= mid; i++) {
        c[k] = a[i];
        k++;
    }

    for (; j <= high; j++) {
        c[k] = a[j];
        k++;
    }

    for(int l = low; l<=high;l++)
    {
        a[l]=c[l];
    }
}
    public int[] sortArray(int[] nums) {
         mergesort(nums,0,nums.length - 1);
    return nums;
}
}
 
