import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

    @Test
    void shouldPerformXMove() {
        Move[][] grid = new Move[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, Move.X);

        Assertions.assertEquals(Move.X, grid[0][0]);
    }

    @Test
    void shouldPerformOMove() {
        Move[][] grid = new Move[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, Move.O);

        Assertions.assertEquals(Move.O, grid[0][0]);
    }

}