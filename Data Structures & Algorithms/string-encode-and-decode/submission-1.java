class Solution {

    public String encode(List<String> strs) {
        StringBuilder encoded = new StringBuilder();

        for (String str : strs) {
            int num = str.length();
            encoded.append(num);
            encoded.append("#");
            encoded.append(str);
        }

        return encoded.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            //Check length
            int len = 0;
            while(str.charAt(j) != '#'){
                int num = 0;
                num = str.charAt(j) - '0';
                len = len * 10 + num;
                j++;
                
            }
            // int len = Integer.parseInt(str.substring(i, j));
            //set start and end index to string body
            int start = j + 1;
            int end = start + len;
            res.add(str.substring(start,end));
            i = end;
        }
        return res;
    }
}
