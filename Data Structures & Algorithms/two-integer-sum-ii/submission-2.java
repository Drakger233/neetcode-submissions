class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while(l < r){
            int complement = target - numbers[l];
            if(complement > numbers[r]){
                l++;
            }
            else if(complement < numbers[r]){
                r--;
            }
            else{
                return new int[]{l+1,r+1};
            }
        }
        return new int[]{0,0};
    }
}
