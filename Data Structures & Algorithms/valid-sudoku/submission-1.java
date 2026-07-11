class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < board.length; r++) {
            Set<Character> digits = new HashSet<Character>();
            for (int c = 0; c < board[0].length; c++) {
                if (board[r][c] != '.') {
                    if (digits.contains(board[r][c])) {
                        return false;
                    } else {
                        digits.add(board[r][c]);
                    }
                }
            }
        }
        for (int c = 0; c < board[0].length; c++) {
            Set<Character> digits = new HashSet<Character>();
            for (int r = 0; r < board.length; r++) {
                if (board[r][c] != '.') {
                    if (digits.contains(board[r][c])) {
                        return false;
                    } else {
                        digits.add(board[r][c]);
                    }
                }
            }
        }
        for (int box = 0; box < 9; box++) {
            Set<Character> digits = new HashSet<Character>();
            for (int r = 0; r < 3; r++) {
                for (int c = 0; c < 3; c++) {
                    int row = (box / 3) * 3 + r;
                    int col = (box % 3) * 3 + c;
                    if (board[row][col] != '.') {
                        if (digits.contains(board[row][col])) {
                            return false;
                        } else {
                            digits.add(board[row][col]);
                        }
                    }
                }
            }
        }
        return true;
    }
}
