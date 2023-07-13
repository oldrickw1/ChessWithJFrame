import java.awt.event.ActionListener;

public class ChessController {
    ChessModel theModel;
    ChessView theView;

    public ChessController(ChessModel chessModel, ChessView chessView) {
        this.theModel = chessModel;
        this.theView = chessView;
    }


    public void run() {
        theView.setSquares(squareListener);
        theView.setPieces(theModel.getPieces());
    }

    private ActionListener squareListener = (e -> {
        try {
            Square square = (Square) e.getSource();
            Piece piece = square.getPiece();
            if (square.isLit()) {
                theModel.makeMove(square.getPosition());
                theView.setPieces(theModel.getPieces());
                theView.dimSquares();
            } else if (piece != null && piece.isWhite()) {
                theView.dimSquares();
                theModel.setActiveSquare(square);
                theModel.getPossibleActions(piece, square.getPosition()).forEach(theView::lightUpSquare);
            }
        } catch (Exception exception) {
            theView.displayErrorMessage("Something went wrong");
            exception.printStackTrace();
        }
    });
}