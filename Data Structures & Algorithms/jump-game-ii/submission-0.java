class Solution {
    public int jump(int[] nums) {
        int jump = 0;
        int currEnd = 0;
        int farther = 0;

        for(int i = 0; i<  nums.length - 1; i++){
            farther = Math.max(farther,i + nums[i]);
            if(currEnd == i){
                jump++;
                currEnd = farther;
            }
        }
        return jump;
    }
}
