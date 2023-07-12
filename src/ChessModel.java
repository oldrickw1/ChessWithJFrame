import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ChessModel {
    private Piece activePiece;

    private Piece[][] board = new Piece[8][8];

    public ChessModel() {
        populateBoard();
    }


    private void populateBoard() {
        // TODO: Swap queen with king
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

    public void makeMove(Coordinate destination) {
        int destinationRow = destination.getRow();
        int destinationCol = destination.getColumn();
        board[activePiece.getCoordinate().getRow()][activePiece.getCoordinate().getColumn()] = null;
        board[destinationRow][destinationCol] = activePiece;
    }

    public List<Coordinate> getPossibleActions(Coordinate position) {
        System.out.println("Clicked on position: " + position);
        Piece pieceOnSquare = board[position.getRow()][position.getColumn()];

        if (pieceOnSquare == null || !(pieceOnSquare.isWhite())) {
            return null;
        } else {
            ArrayList<List<Coordinate>> allTrajectories = pieceOnSquare.getAllTrajectories(position);
            System.out.println("All Trajectories: ");
            for (List<Coordinate> trajectory : allTrajectories) {
                for (Coordinate coordinate : trajectory) {
                    System.out.println(coordinate);
                }
            }
            List<Coordinate> possibleSteps = filterIllegalSteps(allTrajectories);
            return possibleSteps;
        }
    }

    private List<Coordinate> filterIllegalSteps(ArrayList<List<Coordinate>> allTrajectories) {
        List<Coordinate> possibleSteps = new ArrayList<>();
        for (List<Coordinate> trajectory : allTrajectories) {
            for (Coordinate coordinate : trajectory) {
                Boolean hitFirstEnemy = false;
                if (!(coordinateOffBoard(coordinate))) {

                    // todo: Filter out illegal enemy steps
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
        int row = coordinate.getRow();
        int col = coordinate.getColumn();
        return ((row < 0 || row > 7) || (col < 0 || col > 7));
    }

    public Piece[][] getBoard() {
        return board;
    }

    public Piece getActivePiece() {
        return activePiece;
    }

    public void setActivePiece(Piece activePiece) {
        this.activePiece = activePiece;
    }
}
