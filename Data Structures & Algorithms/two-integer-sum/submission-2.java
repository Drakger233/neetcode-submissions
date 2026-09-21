class Solution {
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> check = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int need = target - nums[i];
            if (check.containsKey(need)){
                return new int[]{check.get(need),i};
            }
                check.put(nums[i], i);
        }
        return null;
    }
}
