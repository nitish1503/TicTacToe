import Exception.InvalidMoveExcception;

public class Grid {
    private final Move[][] grid;
    private final GameStatus gameStatus;

    public Grid(Move[][] grid) {
        this.grid = grid;
        gameStatus = GameStatus.CONTINUE;
    }

    public void move(Position position) throws InvalidMoveExcception {
        if (grid[position.getX()][position.getY()] == null)
            grid[position.getX()][position.getY()] = position.getMove();
        else
            throw new InvalidMoveExcception();
    }

    public GameStatus checkStatus() {
        return gameStatus;
    }
}
