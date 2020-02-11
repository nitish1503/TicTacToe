import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Exception.InvalidMoveExcception;


class TicTacToeTest {

    @Test
    void shouldPerformXMove() throws InvalidMoveExcception {
        Move[][] grid = new Move[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, Move.X);

        Assertions.assertEquals(Move.X, grid[0][0]);
    }

    @Test
    void shouldPerformOMove() throws InvalidMoveExcception {
        Move[][] grid = new Move[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, Move.O);

        Assertions.assertEquals(Move.O, grid[0][0]);
    }

    @Test
    void shouldPerformMoveAtValidPositionOnly() throws InvalidMoveExcception {
        Move[][] grid = new Move[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);
        ticTacToe.move(0, 0, Move.O);

        Assertions.assertThrows(InvalidMoveExcception.class, () -> ticTacToe.move(0, 0, Move.O));


    }
}