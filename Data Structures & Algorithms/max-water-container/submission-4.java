class Solution {
    public int maxArea(int[] heights) {
        int l = 0,r = heights.length - 1;
        int area = 0;
        if(r-l == 1){
            if(heights[l] != 0 && heights[r] != 0){
            return 1;
        }else{
            return 0;
        }}

        while(l <= r){
            if(heights[r] < heights[l]){
                area = Math.max(Math.min(heights[l],heights[r]) * (r - l),area);
                r--;
            }else if(heights[r] > heights[l]){
                area = Math.max(Math.min(heights[l],heights[r]) * (r - l),area);
                l++;
            }else{
                area = Math.max(Math.min(heights[l],heights[r]) * (r - l),area);
                l++;
                r--;
            }
        }
        return area;
    }
}
