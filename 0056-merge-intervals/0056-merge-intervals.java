class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();

        int[] previous = intervals[0];
        for(int i = 1; i< intervals.length; i++)
        {
            int[] current = intervals[i];
            int pend= previous[1];
            int pstar=previous[0];
            int curs=current[0];
            int curen = current[1];
            if(pend>=curs){
                previous[0]= Math.min(pstar,curs);
                previous[1]= Math.max(pend,curen);
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