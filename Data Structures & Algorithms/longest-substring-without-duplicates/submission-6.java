class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        int right = 0;
        Set<Character> list = new HashSet<>();
        while(right<s.length()){
            while(!list.add(s.charAt(right))){
                list.remove(s.charAt(left));
                left++;
                continue;
            }
            right++;
            max = Math.max(max,right - left);
        }
        return max;
    }
}
