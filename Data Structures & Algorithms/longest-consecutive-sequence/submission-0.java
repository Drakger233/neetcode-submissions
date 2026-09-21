class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int maxOutput = 0;
        for(int i =0; i< nums.length;i++){
            set.add(nums[i]);
        }
        for (int x : set) {
            if (!set.contains(x - 1)) {
        // x 才是某条连续序列的起点
        // 然后一直检查 x + 1, x + 2 ...
                int curr = 1;
                while(set.contains(x+1)){
                    x++;
                    curr++;
                }
                maxOutput = Math.max(curr,maxOutput);
            }
        }
        return maxOutput;
    }
}
