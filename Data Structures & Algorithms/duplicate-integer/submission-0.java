class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> ifduplicate = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(ifduplicate.contains(nums[i])){
                return true;
            }
            ifduplicate.add(nums[i]);
        }
        return false;
    }
}