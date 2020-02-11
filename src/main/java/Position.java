public class Position {

    private final int x;
    private final int y;
    private final Move move;

    public Position(int x, int y, Move move) {
        this.x = x;
        this.y = y;
        this.move = move;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Move getMove() {
        return move;
    }
}
