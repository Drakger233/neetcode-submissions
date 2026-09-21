class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left_product = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                left_product[i] = 1;
                continue;
            }
            left_product[i] = nums[i - 1] * left_product[i - 1];
        }
        int right_product = 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i == nums.length - 1){
                left_product[i] = left_product[i];
                continue;
            }
             right_product *= nums[i+1];
             left_product[i] *= right_product;
        }
        return left_product;
    }
}  
