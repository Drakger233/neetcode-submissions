class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
       Set<Character>[][] matrix = new HashSet[3][3];

        for(int i = 0; i < board.length; i++){
                rows[i] = new HashSet<>();
            for(int j = 0; j < board[0].length; j++){
                cols[j] = new HashSet<>();
            }
        }
        for(int i = 0; i < board.length/3; i++){
            for(int j = 0; j < board[0].length/3; j++){
                 matrix[i][j] = new HashSet<>();
            }
        }
        for(int row = 0; row < board.length; row++){
            for(int col = 0; col < board[0].length; col++){
                if(board[row][col] == '.') continue;
                if(!rows[row].add(board[row][col])){
                    return false;
                }
                if(!cols[col].add(board[row][col])){
                    return false;
                }
                if(!matrix[row/3][col/3].add(board[row][col])){
                    return false;
                } 
            }
        }
        return true;
    }
}
