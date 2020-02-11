import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Exception.InvalidMoveExcception;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class TicTacToeTest {

    @Test
    void shouldShowPlayerAAsWinner() throws InvalidMoveExcception {
        Grid grid = mock(Grid.class);
        TicTacToe ticTacToe = new TicTacToe(grid);
        Player playerO = mock(Player.class);
        Player playerX = mock(Player.class);
        when(grid.checkStatus()).thenReturn(GameStatus.PLAYER_X_WIN);
        when(playerX.toMove()).thenReturn(new Position(0, 0, Move.X), new Position(0, 1, Move.X), new Position(0, 2, Move.X));
        when(playerO.toMove()).thenReturn(new Position(1, 0, Move.O), new Position(1, 1, Move.O), new Position(1, 2, Move.O));

        ticTacToe.play(playerX, playerO);

        Assertions.assertEquals(GameStatus.PLAYER_X_WIN, ticTacToe.getGameStatus());
    }

    @Test
    void shouldShowPlayerBAsWinner() throws InvalidMoveExcception {
        Grid grid = mock(Grid.class);
        TicTacToe ticTacToe = new TicTacToe(grid);
        Player playerO = mock(Player.class);
        Player playerX = mock(Player.class);
        when(grid.checkStatus()).thenReturn(GameStatus.PLAYER_O_WIN);
        when(playerX.toMove()).thenReturn(new Position(0, 0, Move.X), new Position(0, 1, Move.X), new Position(2, 2, Move.X));
        when(playerO.toMove()).thenReturn(new Position(1, 0, Move.O), new Position(1, 1, Move.O), new Position(1, 2, Move.O));

        ticTacToe.play(playerX, playerO);

        Assertions.assertEquals(GameStatus.PLAYER_O_WIN, ticTacToe.getGameStatus());
    }
}