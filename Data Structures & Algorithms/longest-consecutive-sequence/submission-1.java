class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> check = new HashSet<>();
        int max = 0;
        for(int c:nums){
            check.add(c);
        }
        for(int x: check){
            if(!check.contains(x-1)){
                int currlength = 1;
                while(check.contains(x+1)){
                    x=x+1;
                    currlength++;
                   
                }
            max = Math.max(currlength,max);
            }
        }
        return max;
    }
}
