class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
    
           int temp[][] = new int[1][2];
        
        
        for(int l = 0; l < intervals.length - 1; l++) {
             for(int m = l + 1; m < intervals.length; m++) {
                if(intervals[l][0]==intervals[m][0]){
                    if(intervals[l][1]<=intervals[m][1]){
                        temp[0] = intervals[l];
                     intervals[l] = intervals[m];
                     intervals[m] = temp[0];
                    }
                    
                }
                 else if(intervals[l][0] > intervals[m][0]) {
                     temp[0] = intervals[l];
                     intervals[l] = intervals[m];
                     intervals[m] = temp[0];
                 }
             }
        }
    ArrayList<int[]> arr = new ArrayList<>();
        int maxend = -1;
        for(int i = 0; i < intervals.length;i++){
            if(intervals[i][1] > maxend){
                maxend = intervals[i][1];
                arr.add(intervals[i]);
            }
        }

        
       return arr.size();
        }

    }
