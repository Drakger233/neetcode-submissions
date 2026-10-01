class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max = 0;
        Set<Character> seek = new HashSet<>();
        for(int right = 0;right < s.length();right++){
            while(seek.contains(s.charAt(right))){
                seek.remove(s.charAt(left));
                left++;
            }
            seek.add(s.charAt(right));
            max = Math.max(max,right - left + 1);
        }
        return max;
    }
}
