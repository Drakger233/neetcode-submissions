class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxLength = 1;
        for(int right = 0;right < s.length();right++){
            count[s.charAt(right) - 'A']++;
            int maxFreq = 0;
            for(int i:count){
                maxFreq = Math.max(maxFreq, i);
            }
            while ((right - left + 1) - maxFreq > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            maxLength = Math.max(maxLength,right - left + 1);
        }
        return maxLength;
    }
}
