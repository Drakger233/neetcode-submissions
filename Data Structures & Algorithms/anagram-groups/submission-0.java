class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(String str: strs){
            int[] count = new int[26];
            for(int i = 0;i < str.length();i++){
                count[str.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            if (map.containsKey(key)){
                map.get(key).add(str);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key,list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
