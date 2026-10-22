class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> result = new ArrayList<>();
        for(int[] interval : intervals){
            if(result.isEmpty() || result.get(result.size()-1)[1] < interval[0]){
                result.add(interval);
            }else{
                int[] lastMerged = result.get(result.size() - 1);
                lastMerged[1] = Math.max(lastMerged[1], interval[1]);
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
