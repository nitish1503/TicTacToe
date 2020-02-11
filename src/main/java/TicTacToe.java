public class TicTacToe {
    private Move[][] grid;

    public TicTacToe(Move[][] grid) {
        this.grid = grid;
    }

    public void move(int x, int y, Move move) {
        grid[x][y] = move;
    }
}
