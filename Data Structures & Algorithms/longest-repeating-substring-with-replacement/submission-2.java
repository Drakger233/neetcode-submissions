class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int maxLength = 0;
        int maxFreq = 0;
        int[] freq = new int[26];
        for(int r = 0; r < s.length();r++){
            int index = s.charAt(r) - 'A';
            freq[index]++;

            maxFreq = Math.max(freq[index],maxFreq);

            while((r - l + 1) - maxFreq > k){
                freq[s.charAt(l) - 'A']--;
                l++;
            }
            maxLength = Math.max(maxLength, r - l + 1);
        }
        return maxLength;
    }
}