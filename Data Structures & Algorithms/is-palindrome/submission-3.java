class Solution {
    public boolean isPalindrome(String s) {
        char[] st = s.toCharArray();
        int l = 0;
        int r = st.length - 1;
        while(l < r){
            char cl = st[l];
            char cr = st[r];
            if (!((cl >= 'a' && cl <= 'z') ||
                (cl >= 'A' && cl <= 'Z') ||
                (cl >= '0' && cl <= '9'))){
                l++;
                continue;
            }
            if(!((cr >= 'a' && cr <= 'z') ||
                (cr >= 'A' && cr <= 'Z') ||
                (cr >= '0' && cr <= '9'))){
                r--;
                continue;
            }
            if (cl >= 'A' && cl <= 'Z'){
                cl = (char)(cl - 'A' + 'a');
}
            if (cr >= 'A' && cr <= 'Z'){
                cr = (char)(cr - 'A' + 'a');
}
                if(cl != cr){
                return false;
            }
            l++;
            r--;
            }
            return true;
        }
    }

