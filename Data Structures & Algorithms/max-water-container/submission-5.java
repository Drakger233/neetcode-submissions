class Solution {
    public int maxArea(int[] heights) {
        int l = 0,r = heights.length - 1;
        int area = 0;

        while(l <= r){
            area = Math.max(Math.min(heights[l],heights[r]) * (r - l),area);
            if(heights[r] < heights[l]){
                r--;
            }else if(heights[r] > heights[l]){
                l++;
            }else{
                l++;
                r--;
            }
        }
        return area;
    }
}
