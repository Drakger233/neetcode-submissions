class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] lastSeenIndex = new int[26];
        for(int i = 0; i < s.length();i++){
            lastSeenIndex[s.charAt(i) - 'a'] = i;
        }
        int end = 0;
        int start = 0;
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < s.length();i++){
            end = Math.max(lastSeenIndex[s.charAt(i) - 'a'],end);
            if(end == i){
                res.add(end - start + 1);
                start = i + 1;
            }
        }
        return res;
    }
}
