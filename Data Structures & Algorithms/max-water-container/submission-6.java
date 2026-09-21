class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int maxArea = 0; 
        while (left < right){
            int currArea = 0;
            if(heights[left] < heights[right]){
                currArea = heights[left] * (right - left);
                left++;
            }else if (heights[right] < heights[left]){
                currArea = heights[right] * (right - left);
                right--;
            }else{
                currArea = heights[right] * (right - left);
                left++;
                right--;
            }
            maxArea = Math.max(currArea, maxArea);
        }
        return maxArea;
    }
}
