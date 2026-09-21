class Solution {
    public boolean isAnagram(String s, String t) {
        int[] diffcheck = new int[26];
        if(s.length()!= t.length())return false;
        for(int i = 0; i < s.length();i++){
            diffcheck[s.charAt(i) - 'a']++;
            diffcheck[t.charAt(i) - 'a']--;
        }
        for(int check = 0; check < diffcheck.length;check++){
            if(diffcheck[check] != 0){
                return false;
            }
        }
        return true;
    }
}
