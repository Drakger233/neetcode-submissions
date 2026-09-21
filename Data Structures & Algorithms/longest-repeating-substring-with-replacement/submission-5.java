class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int max = 0;
        int[] count = new int[26];
        int maxFreq = 0;
        //sliding window
        for(int right = 0; right < s.length(); right++){
            count[s.charAt(right) - 'A']++;
            for(int num:count){
                maxFreq = Math.max(num,maxFreq);
            }
            while(right - left + 1 - maxFreq > k){
                count[s.charAt(left) - 'A']--;
                left++;
            }
            max = Math.max(max,right - left + 1);
        }
        return max;
    }
}
