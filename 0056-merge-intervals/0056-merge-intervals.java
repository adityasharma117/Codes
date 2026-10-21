class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        List<int[]> ans = new ArrayList<>();
      //  int curs = 0;
      //  int curen = 0;
        int[] previous = intervals[0];
        for(int i = 1; i < intervals.length; i++){
            int[] current = intervals[i];
        int pstart = previous[0];
        int pend = previous[1];
        int curs = current[0];
        int curen = current[1];

        if(pend>=curs){
            previous = new int[] {
                Math.min(pstart,curs),
                Math.max(pend,curen)
            };
        }
        else{
            ans.add(previous);
            previous = current;
        }

        }
        ans.add(previous);
        return ans.toArray(new int[ans.size()][]);
    }
}