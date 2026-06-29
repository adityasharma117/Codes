
class Solution {
    public int largestAltitude(int[] gain) {
        
        for(int i = 1; i<gain.length; i++){
            gain[i] = gain[i]+gain[i-1];
            
        }
      Arrays.sort(gain);
      int max = gain[gain.length-1];
      if(max>=0)
      return max;
      else return 0;

        }
    }
