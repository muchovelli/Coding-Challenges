class Solution {
    private boolean isBoxValid(char[][] board, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int k = 0; k < 3; k++) {
            for (int m = 0; m < 3; m++) {
                if (Character.isDigit(board[i + k][j + m])) {
                    if (!set.add(board[i + k][j + m])) {
                        System.out.println("box: " + board[i + k][j + m] + " " + i + k + " " + j + k);
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean isRowValid(char[][] board, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int k = 0; k < 9; k++) {
            if (Character.isDigit(board[i][k])) {
                if (!set.add(board[i][k])) {
                    System.out.println("row: " + board[i][k]);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isColValid(char[][] board, int i, int j) {
        HashSet<Character> set = new HashSet<>();
        for (int k = 0; k < 9; k++) {
            if (Character.isDigit(board[k][j])) {
                if (!set.add(board[k][j])) {
                    System.out.println("col: " + board[k][j]);
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 7; i = i + 3) {
            for (int j = 0; j < 7; j = j + 3) {
                if (!isBoxValid(board, i, j)) {
                    return false;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (!isRowValid(board, i, i) || !isColValid(board, i, i)) {
                return false;
            }
        }
        return true;
    }
}