class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(res,sb,0,0,n);
        return res;
    }
    private void helper(List<String> res, StringBuilder sb, int left,int right, int n){
        if(left == n && right == n){
            res.add(sb.toString());
            return;
        }
        if(left < n){
            sb.append('(') ;
            helper(res,sb,left + 1,right,n);
            sb.deleteCharAt(sb.length()-1);
        }
        if(right < left){
            sb.append(')') ;
            helper(res,sb,left,right+1,n);
            sb.deleteCharAt(sb.length()-1);

        }
    }
}
