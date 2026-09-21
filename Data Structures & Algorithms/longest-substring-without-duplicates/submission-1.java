class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxOutput = 0, left = 0;
        for(int i = 0; i < s.length();i++){
            Character c = s.charAt(i);
            while (set.contains(c)) {
                set.remove(s.charAt(left));
                left++;
                }
            set.add(c);
            maxOutput = Math.max(set.size(),maxOutput);
        }
        return maxOutput;

    }
}
