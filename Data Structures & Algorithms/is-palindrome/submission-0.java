class Solution {
    public boolean isPalindrome(String s) {
        char[] sentence = s.toCharArray();
        int left = 0;
        int right = sentence.length - 1;
        while(left < right){
            if (!Character.isLetterOrDigit(sentence[left])) {
                left++;
                continue;
                }
            if (!Character.isLetterOrDigit(sentence[right])) {
                right--;
                continue;
            }
            else{
               if (Character.toLowerCase(sentence[left])!= Character.toLowerCase(sentence[right])) {
                return false;
}
                left++;
                right--;
            }
        }
        return true;
    }
}
