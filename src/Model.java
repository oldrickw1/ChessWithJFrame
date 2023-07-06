import java.util.HashMap;
import java.util.List;

public class Model {
    private HashMap<Coordinate, Piece> board;

    public Model() {
        initBoard();

    }

    private void initBoard() {
        board.put(new Coordinate(1, 'A'), new Rook(1, true, new Coordinate(1, 'A')));
        board.put(new Coordinate(1, 'B'), new Knight(2, true, new Coordinate(1, 'B')));
        board.put(new Coordinate(1, 'C'), new Bishop(3, true, new Coordinate(1, 'C')));
        board.put(new Coordinate(1, 'D'), new Queen(4, true, new Coordinate(1, 'D')));
        board.put(new Coordinate(1, 'E'), new King(5, true, new Coordinate(1, 'E')));
        board.put(new Coordinate(1, 'F'), new Rook(6, true, new Coordinate(1, 'F')));
        board.put(new Coordinate(1, 'G'), new Rook(7, true, new Coordinate(1, 'G')));
        board.put(new Coordinate(1, 'H'), new Rook(8, true, new Coordinate(1, 'H')));
        board.put(new Coordinate(2, 'A'), new Pawn(9, true, new Coordinate(2, 'A')));
        board.put(new Coordinate(2, 'B'), new Pawn(10, true, new Coordinate(2, 'B')));
        board.put(new Coordinate(2, 'C'), new Pawn(11, true, new Coordinate(2, 'C')));
        board.put(new Coordinate(2, 'D'), new Pawn(12, true, new Coordinate(2, 'D')));
        board.put(new Coordinate(2, 'E'), new Pawn(13, true, new Coordinate(2, 'E')));
        board.put(new Coordinate(2, 'F'), new Pawn(14, true, new Coordinate(2, 'F')));
        board.put(new Coordinate(2, 'G'), new Pawn(15, true, new Coordinate(2, 'G')));
        board.put(new Coordinate(2, 'H'), new Pawn(16, true, new Coordinate(2, 'H')));
        board.put(new Coordinate(3, 'A'), null);
        board.put(new Coordinate(3, 'B'), null);
        board.put(new Coordinate(3, 'C'), null);
        board.put(new Coordinate(3, 'D'), null);
        board.put(new Coordinate(3, 'E'), null);
        board.put(new Coordinate(3, 'F'), null);
        board.put(new Coordinate(3, 'G'), null);
        board.put(new Coordinate(3, 'H'), null);
        board.put(new Coordinate(4, 'A'), null);
        board.put(new Coordinate(4, 'B'), null);
        board.put(new Coordinate(4, 'C'), null);
        board.put(new Coordinate(4, 'D'), null);
        board.put(new Coordinate(4, 'E'), null);
        board.put(new Coordinate(4, 'F'), null);
        board.put(new Coordinate(4, 'G'), null);
        board.put(new Coordinate(4, 'H'), null);
        board.put(new Coordinate(5, 'A'), null);
        board.put(new Coordinate(5, 'B'), null);
        board.put(new Coordinate(5, 'C'), null);
        board.put(new Coordinate(5, 'D'), null);
        board.put(new Coordinate(5, 'E'), null);
        board.put(new Coordinate(5, 'F'), null);
        board.put(new Coordinate(5, 'G'), null);
        board.put(new Coordinate(5, 'H'), null);
        board.put(new Coordinate(6, 'A'), null);
        board.put(new Coordinate(6, 'B'), null);
        board.put(new Coordinate(6, 'C'), null);
        board.put(new Coordinate(6, 'D'), null);
        board.put(new Coordinate(6, 'E'), null);
        board.put(new Coordinate(6, 'F'), null);
        board.put(new Coordinate(6, 'G'), null);
        board.put(new Coordinate(6, 'H'), null);
        board.put(new Coordinate(2, 'A'), new Pawn(17,false, new Coordinate(7, 'A')));
        board.put(new Coordinate(2, 'B'), new Pawn(18, false, new Coordinate(7, 'B')));
        board.put(new Coordinate(2, 'C'), new Pawn(19, false, new Coordinate(7, 'C')));
        board.put(new Coordinate(2, 'D'), new Pawn(20, false, new Coordinate(7, 'D')));
        board.put(new Coordinate(2, 'E'), new Pawn(21, false, new Coordinate(7, 'E')));
        board.put(new Coordinate(2, 'F'), new Pawn(22, false, new Coordinate(7, 'F')));
        board.put(new Coordinate(2, 'G'), new Pawn(23, false, new Coordinate(7, 'G')));
        board.put(new Coordinate(2, 'H'), new Pawn(24, false, new Coordinate(7, 'H')));
        board.put(new Coordinate(1, 'A'), new Rook(25, false, new Coordinate(8, 'A')));
        board.put(new Coordinate(1, 'B'), new Knight(26, false, new Coordinate(8, 'B')));
        board.put(new Coordinate(1, 'C'), new Bishop(27, false, new Coordinate(8, 'C')));
        board.put(new Coordinate(1, 'D'), new Queen(28, false, new Coordinate(8, 'D')));
        board.put(new Coordinate(1, 'E'), new King(29, false, new Coordinate(8, 'E')));
        board.put(new Coordinate(1, 'F'), new Rook(30, false, new Coordinate(8, 'F')));
        board.put(new Coordinate(1, 'G'), new Rook(31, false, new Coordinate(8, 'G')));
        board.put(new Coordinate(1, 'H'), new Rook(32, false, new Coordinate(8, 'H')));

    }
}
