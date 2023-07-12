import java.awt.event.ActionListener;

public class ChessController {
    ChessModel theModel;
    ChessView theView;

    public ChessController(ChessModel chessModel, ChessView chessView) {
        this.theModel = chessModel;
        this.theView = chessView;
    }


    public void run() {
        theView.setSquareListener(squareListener);
    }

    private ActionListener squareListener = (e -> {
        try {
            Square square = (Square) e.getSource();
            if (square.isLit()) {

            }

        } catch (Exception exception) {
            theView.displayErrorMessage("Something went wrong");
            exception.printStackTrace();
        }
    });
}