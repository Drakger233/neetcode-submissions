class Solution {
    public boolean isAnagram(String s, String t) {
        int[] list = new int[26];
        if(s.length()!=t.length()||s == null||t == null)return false;
        for(int order = 0; order < s.length();order++){
            list[s.charAt(order) - 'a']++;
            list[t.charAt(order) - 'a']--;
        }
        
        for(int i =0; i < list.length; i++){
            if(list[i] != 0){
                return false;
            }
        }
        return true;
    }
}
