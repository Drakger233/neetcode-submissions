class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        char[] array = new char[n*2];
        helper(res,array,n,n,0);
        return res;
    }
    private void helper(List<String> res, char[] array, int left,int right, int index){
        if(left == 0 && right == 0){
            res.add(new String(array));
            return;
        }
        if(left > 0){
            array[index] = '(';
            helper(res,array,left - 1,right,index+1);
        }
        if(right > left){
            array[index] = ')';
            helper(res,array,left,right - 1,index+1);
        }
    }
}
