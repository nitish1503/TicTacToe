import Exception.InvalidMoveExcception;

public class TicTacToe {
    private Grid grid;

    public TicTacToe(Grid grid) {
        this.grid = grid;
    }

    public void play(Player playerX, Player playerO) throws InvalidMoveExcception {
        Player player = playerX;
        do {
            grid.move(player.toMove());
            if (player == playerX)
                player = playerO;
            else
                player = playerX;
        } while (grid.checkStatus() == GameStatus.CONTINUE);
    }

    public GameStatus getGameStatus() {
        return grid.checkStatus();
    }
}
