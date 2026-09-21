class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[][] boxes = new HashSet[3][3];

        for (int i = 0; i < 9; i++) {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
        }

        for (int r = 0; r < 3; r++) {
            for (int c = 0; c < 3; c++) {
                boxes[r][c] = new HashSet<>();
            }
        }
        for (int row = 0; row < 9; row++) {
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                // rows[row].add(value[0]);
                // cols[col].add(value[1]);
                // boxes[row / 3][col / 3].add(value);
                if (value == '.') {
                    continue;
                }                                           
                if (!rows[row].add(value) ||
                    !cols[col].add(value) ||
                    !boxes[row / 3][col / 3].add(value)) {
                return false;
                }
            }
        }
        return true;
    }
}