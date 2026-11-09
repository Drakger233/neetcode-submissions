class Solution {
    public boolean checkValidString(String s) {
        int miniumLeftExist= 0;
        int maxiumLeftExist = 0;

        for(char c:s.toCharArray()){
            if(c == '('){
                miniumLeftExist++;
                maxiumLeftExist++;
            }else if(c == ')'){
                miniumLeftExist--;
                maxiumLeftExist--;
            }else{
                miniumLeftExist--;
                maxiumLeftExist++;
            }
            if(maxiumLeftExist < 0){
                return false;
            }
            miniumLeftExist = Math.max(0, miniumLeftExist);
        }
        return miniumLeftExist == 0;
    }
}
