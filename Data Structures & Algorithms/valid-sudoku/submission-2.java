class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int cols = 0; cols < 9; cols++) {
            Set<Character> col = new HashSet<>();
            for (int rows = 0; rows < 9; rows++) {
                if(board[rows][cols] != '.'){
                    if(col.contains(board[rows][cols])){
                    // 固定 cols，只改变 rows
                    return false;
                    }
                col.add(board[rows][cols]);
                }
            }
        }
        for (int rows = 0; rows < 9; rows++) {
            Set<Character> row = new HashSet<>();
            for (int cols = 0; cols < 9; cols++) {
                if(board[rows][cols] != '.'){
                    if(row.contains(board[rows][cols])){
                    // 固定 cols，只改变 rows
                    return false;
                        }
                row.add(board[rows][cols]);
                    }
                }
            }
        Set<Character>[] boxs = new HashSet[9];
        for(int i =0;i < 9;i++){
            boxs[i] = new HashSet<>();
        }
        for (int rows = 0; rows < 9; rows++) {
            for (int cols = 0; cols < 9; cols++) {
                if(board[rows][cols] != '.'){
                    int boxIndex = (rows / 3) * 3 + cols / 3;
                    if(boxs[boxIndex].contains(board[rows][cols])){
                    return false;
                        }
                boxs[boxIndex].add(board[rows][cols]);
                    }
                }
            }
        return true;
    }
}
