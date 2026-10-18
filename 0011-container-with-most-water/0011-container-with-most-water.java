class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxa = Integer.MIN_VALUE;
        
    while(left < right)
            {           int minh = Math.min(height[left], height[right]);
                        int area  = minh*(right-left);
                        maxa= Math.max(maxa, area );
                    if(height[left]<height[right]){
                        left++;
                    }
                    else{right--;}
                
            }

return maxa;
        }
    }
