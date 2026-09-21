class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0;i < nums.length - 2 ;i++){
            int l = i + 1;
            int r = nums.length - 1;
            int target = 0 - nums[i];
            if(i>0 && nums[i] == nums[i - 1]){
                continue;
            }
            while(l < r){
                int sum = nums[l] + nums[r];
                if(sum < target){
                    l++;
                }else if(sum > target){
                    r--;
                }else{
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                    while (l < r && nums[l] == nums[l - 1]) {
                        l++;}
                    while (l < r && nums[r] == nums[r + 1]) {
                        r--;}
                }
            }
        }
        return res;
    }
}
