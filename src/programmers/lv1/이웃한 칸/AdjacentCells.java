public class AdjacentCells {
    public int solution(String[][] board, int h, int w) {
        int n = board.length;

        int[] dh = {-1, 0, 1, 0};
        int[] dw = {0, 1, 0, -1};

        int count = 0;

        for (int i = 0; i < 4; i++) {
            int checkH = h + dh[i];
            int checkW = w + dw[i];

            if (checkH >= 0 && checkH < n &&
                checkW >= 0 && checkW < n) {

                if (board[h][w].equals(board[checkH][checkW])) {
                    count++;
                }
            }
        }

        return count;
    }
}
