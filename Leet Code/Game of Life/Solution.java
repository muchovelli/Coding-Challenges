public class Solution {
    public void gameOfLife(int[][] board) {
        
    }

    private void nextGen(int[][] board, int n, int m) {
        int[][] future = new int[n][m];

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) { 
                
                int aliveCells = 0;

                for(int k = -1; k <= 1; k++) {
                    for(int l = -1; l <= 1; l++) {
                        if(i+k >= 0 && i+k < m && j+l >=0 && j+l < n) {
                            aliveCells += board[i+k][l+j];
                        }
                    }
                }

                aliveCells -= board[i][j];

                if((board[i][j] == 1 && aliveCells < 2) || (board[i][j] == 1 && aliveCells > 3)) {
                    future[i][j] = 0;
                }
                else if(board[i][j] == 0 && aliveCells ==3 ) {
                    future[i][j] = 1;
                }else{
                    future[i][j] = board[i][j];
                }
            }
        }
        return future;
    }
}
