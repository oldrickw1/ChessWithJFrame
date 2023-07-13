import java.util.ArrayList;
import java.util.List;

public class ChessModel {
    private Square activeSquare;
    private ArrayList<Piece> pieces = new ArrayList<>();

    public ChessModel() {
        populateBoard();
    }


    private void populateBoard() {
        // TODO: Swap queen with king
        //White
        pieces.add(new Rook(true));
        pieces.add(new Knight( true));
        pieces.add(new Bishop( true));
        pieces.add(new King( true));
        pieces.add(new Queen( true));
        pieces.add(new Bishop( true));
        pieces.add(new Knight( true));
        pieces.add(new Rook( true));

        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));
        pieces.add(new Pawn(true));


        // Black
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));
        pieces.add(new Pawn(false));

        pieces.add(new Rook(false));
        pieces.add(new Knight( false));
        pieces.add(new Bishop( false));
        pieces.add(new King( false));
        pieces.add(new Queen( false));
        pieces.add(new Bishop( false));
        pieces.add(new Knight( false));
        pieces.add(new Rook( false));
    }

    public void makeMove(Coordinate destination) {
        // if this is an attack, then kill enemy piece
        for (Piece piece : pieces) {
            if (piece.getCoordinate() == destination) {
                piece.setCoordinate(null);
                piece.setAlive(false);
                break;
            }

            activePiece.setCoordinate(destination);
        }
    }

    public List<Coordinate> getPossibleActions(Piece piece, Coordinate position) {
        System.out.println("Clicked on position: " + position);
        int row = position.getRow();
        int col = position.getColumn();

        ArrayList<List<Coordinate>> allTrajectories = piece.getAllTrajectories();
        // this next block is just for testing
        System.out.println("All Trajectories: ");
        for (List<Coordinate> trajectory : allTrajectories) {
            for (Coordinate coordinate : trajectory) {
                System.out.println(coordinate);
            }
        }

        List<Coordinate> possibleSteps = filterIllegalSteps(allTrajectories);
        return possibleSteps;

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

//    private boolean coordinateHitsOwnPlayer(Coordinate coordinate) {
//        Piece piece  = board[coordinate.getRow()][coordinate.getColumn()];
//        return (piece == null || !(piece.isWhite()));
//    }

    private boolean coordinateOffBoard(Coordinate coordinate) {
        int row = coordinate.getRow();
        int col = coordinate.getColumn();
        return ((row < 0 || row > 7) || (col < 0 || col > 7));
    }


    public Square getActiveSquare() {
        return activeSquare;
    }

    public void setActiveSquare(Square activeSquare) {
        this.activeSquare = activeSquare;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
