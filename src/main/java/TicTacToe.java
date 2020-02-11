public class TicTacToe {
    private char[][] grid;

    public TicTacToe(char[][] grid) {
        this.grid = grid;
    }

    public void move(int x, int y) {
        grid[x][y] = 'X';
    }
}
