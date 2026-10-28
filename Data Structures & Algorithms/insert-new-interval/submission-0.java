class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> res = new ArrayList<>();
        int n = intervals.length;
        for(int i = 0; i < n; i++){
            if(intervals[i][0] > newInterval[1]){
                res.add(newInterval);
                newInterval = intervals[i];
            }else if(intervals[i][1] < newInterval[0]){
                res.add(intervals[i]);
            }else{
                int start = Math.min(newInterval[0],intervals[i][0]);
                int end = Math.max(newInterval[1],intervals[i][1]);
                newInterval[0] = start;
                newInterval[1] = end;
            }
        }
        res.add(newInterval);
        return res.toArray(new int[res.size()][]);
    }
}
