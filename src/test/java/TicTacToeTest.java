import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TicTacToeTest {

    @Test
    void shouldPerformXMove() {
        char[][] grid = new char[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, 'X');

        Assertions.assertEquals('X', grid[0][0]);
    }

    @Test
    void shouldPerformOMove() {
        char[][] grid = new char[3][3];
        TicTacToe ticTacToe = new TicTacToe(grid);

        ticTacToe.move(0, 0, 'O');

        Assertions.assertEquals('O', grid[0][0]);
    }

}