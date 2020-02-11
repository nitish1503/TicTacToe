import Exception.InvalidMoveExcception;

public class TicTacToe {
    private Move[][] grid;

    public TicTacToe(Move[][] grid) {
        this.grid = grid;
    }

    public void move(int x, int y, Move move) throws InvalidMoveExcception {
        if (grid[x][y] == null)
            grid[x][y] = move;
        else
            throw new InvalidMoveExcception();
    }
}
