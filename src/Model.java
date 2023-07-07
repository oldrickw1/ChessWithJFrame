import java.util.ArrayList;
import java.util.List;

public class Model {
    private Piece[][] board = new Piece[8][8];

    public Model() {

        populateBoard();
    }

    private void populateBoard() {
        //White
        board[0][0] = new Rook(true);
        board[0][1] = new Knight( true);
        board[0][2] = new Bishop( true);
        board[0][3] = new Queen( true);
        board[0][4] = new King( true);
        board[0][5] = new Bishop( true);
        board[0][6] = new Knight( true);
        board[0][7] = new Rook( true);
        for (int col = 0; col < 8; col++) {
            board[1][col] = new Pawn( true);
        }

        //Black
        for (int col = 0; col < 8; col++) {
            board[6][col] = new Pawn( false);
        }
        board[7][0] = new Rook(false);
        board[7][1] = new Knight( false);
        board[7][2] = new Bishop( false);
        board[7][3] = new Queen( false);
        board[7][4] = new King( false);
        board[7][5] = new Bishop( false);
        board[7][6] = new Knight( false);
        board[7][7] = new Rook( false);
    }

    public List<Coordinate> getPossibleActions(Coordinate position) {
        Piece pieceOnSquare = board[position.getRow()][position.getColumn()];
        if (pieceOnSquare == null || !(pieceOnSquare.isWhite())) {
            return null;
        } else {
            ArrayList<List<Coordinate>> allTrajectories = pieceOnSquare.getAllTrajectories(position);
            List<Coordinate> possibleSteps = filterIllegalSteps(allTrajectories);
            // compare to current board to get all actual steps
            return null;
        }
    }

    private List<Coordinate> filterIllegalSteps(ArrayList<List<Coordinate>> allTrajectories) {
        List<Coordinate> possibleSteps = new ArrayList<>();
        for (List<Coordinate> trajectory : allTrajectories) {
            for (Coordinate coordinate : trajectory) {
                Boolean hitFirstEnemy = false;
                if (!coordinateOffBoard(coordinate) || !(coordinateHitsOwnPlayer(coordinate))) {
                    // hitting open board or (illegal) enemy
                    System.out.println(coordinate);
                    possibleSteps.add(coordinate);

                }
            }
        }
        return possibleSteps;
    }

    private boolean coordinateHitsOwnPlayer(Coordinate coordinate) {
        Piece piece  = board[coordinate.getRow()][coordinate.getColumn()];
        return (piece == null || !(piece.isWhite()));
    }

    private boolean coordinateOffBoard(Coordinate coordinate) {
        return (coordinate.getRow() < 0 || coordinate.getRow() > 7 || coordinate.getColumn() < 0 || coordinate.getColumn() > 7);
    }
}
