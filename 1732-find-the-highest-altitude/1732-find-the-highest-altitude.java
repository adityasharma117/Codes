
class Solution {
    public int largestAltitude(int[] gain) {
        
    int alt = 0;
    int maxal = 0;
    for(int i=0;i<gain.length;i++)
    {
        alt=alt+gain[i];
    maxal = Math.max(maxal,alt);
    }
    return maxal;
    }}
