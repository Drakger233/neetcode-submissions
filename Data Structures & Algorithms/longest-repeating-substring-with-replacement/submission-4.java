class Solution {
    public int characterReplacement(String s, int k) {
        int l = 0;
        int max = 1;
        int[] count = new int[26];
        for(int r = 0; r < s.length();r++){
            count[s.charAt(r) - 'A']++;
            int maxFreq = 0;
            for(int x:count){
                maxFreq = Math.max(x,maxFreq);
            }
            while(r - l + 1 -maxFreq > k){
                count[s.charAt(l)-'A']--;
                l++;
            }
            max = Math.max(max,r-l+1);
        }
        return max;
    }
}
