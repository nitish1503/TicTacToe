import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Exception.InvalidMoveExcception;

class GridTest {

    @Test
    void shouldPerformXMove() throws InvalidMoveExcception {
        Move[][] move = new Move[3][3];
        Grid grid = new Grid(move);
        Position position = new Position(0, 0, Move.X);

        grid.move(position);

        Assertions.assertEquals(Move.X, move[position.getX()][position.getY()]);
    }

    @Test
    void shouldPerformOMove() throws InvalidMoveExcception {
        Move[][] move = new Move[3][3];
        Grid grid = new Grid(move);
        Position position = new Position(0, 0, Move.O);

        grid.move(position);

        Assertions.assertEquals(Move.O, move[position.getX()][position.getY()]);
    }

    @Test
    void shouldPerformMoveAtValidPositionOnly() throws InvalidMoveExcception {
        Move[][] move = new Move[3][3];
        Grid grid = new Grid(move);
        Position position = new Position(0, 0, Move.X);

        grid.move(position);

        Assertions.assertThrows(InvalidMoveExcception.class, () -> grid.move(position));
    }

}