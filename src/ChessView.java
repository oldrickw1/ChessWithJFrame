import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class ChessView {
    private JFrame frame;
    private Square[][] squares;

    private final int ROWS = 8;
    private final int COLS = 8;

    public ChessView() {
        squares = new Square[ROWS][COLS];
        config();
    }



    private void config() {
        this.frame = new JFrame("Ultimate Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(880, 880);
        frame.setLayout(new GridLayout(8,8));
    }

    public void setSquares(ActionListener squareListener) {
        // the reversing is done because GridLayout fills from top to bottom, left to right, while a chess board counts from bottom to top (also from left to right, so columns remain the same)
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                Square square = new Square(new Coordinate(row, col));
                square.addActionListener(squareListener);
                frame.add(square);
                squares[row][col] = square;
            }
        }
        frame.setVisible(true);

    }

    public void lightUpSquare(Coordinate coordinate) {
        int coordinateRow = coordinate.getRow();
        int coordinateCol = coordinate.getColumn();
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                if ((coordinateRow == row) && (coordinateCol == col)) {
                    squares[row][col].lightUp();
                }
            }
        }
    }
//
//    public void updateBoard(Piece[][] board) {
//        for (int row = ROWS-1; row >= 0; row--) {
//            for (int col = 0; col < COLS; col++) {
//                Piece piece = board[row][col];
//                if (squares[row][col].getPiece() != board[row][col]) {
//                    squares[row][col].setPiece(board[row][col]);
//                }
//            }
//        }
//    }
//
//    public void setSquareListener(ActionListener squareListener) {
//        for (int row = ROWS-1; row >= 0; row--) {
//            for (int col = 0; col < COLS; col++) {
//                squares[row][col].addActionListener(squareListener);
//            }
//        }
//    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(frame, errorMessage);
    }


    public void setPieces(ArrayList<Piece> pieces) {
        pieces.forEach(piece -> {
            if (!piece.isAlive()) {
                return;
            }
            int row = piece.getCoordinate().getRow();
            int col = piece.getCoordinate().getColumn();
            squares[row][col].setPiece(piece);

        });
    }

    public void dimSquares() {
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col].dimLight();
            }
        }
    }
}
