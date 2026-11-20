class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(0,nums,res,path);
        return res;
    }
    private void dfs(int i,int[] nums, List<List<Integer>> res, List<Integer> path){
        //base
        if(i == nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        //not add
        dfs(i+1,nums,res,path);
        //add
        path.add(nums[i]);
        dfs(i+1,nums,res,path);
        //remove
        path.remove(path.size() - 1);
    }
}
