class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)->a[0]-b[0]);
        ArrayList<int[]> ans = new ArrayList<>();
        int currs = 0;
        int curen = 0;
        if (intervals.length == 0) return new int[0][];

            int[] previous = intervals[0];
        for(int i = 1 ; i < intervals.length; i++){
            
            int[] current  = intervals[i];
            int psta = previous[0];
            int pend = previous[1];
            currs  = current[0];
            curen= current[1];
            if(pend>=currs){
                previous = new int[] {Math.min(psta, currs), Math.max(curen, pend)};
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
