import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class ChessView {
    private JFrame frame;

    private final int ROWS;
    private final int COLS;

    private Square[][] squares;
    public ChessView(Piece[][] board) {
        squares = new Square[8][8];
        ROWS = board.length;
        COLS = board[0].length;

        config();
        populate(board);
        frame.setVisible(true);
    }

    private void config() {
        this.frame = new JFrame("Ultimate Chess");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(880, 880);
        frame.setLayout(new GridLayout(8,8));
    }

    public void populate(Piece[][] board) {

        // the reversing is done because GridLayout fills from top to bottom, left to right, while a chess board counts from bottom to top (also from left to right, so columns remain the same)
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                Square square = new Square(new Coordinate(row,col));
                Piece piece = board[row][col];
                square.setPiece(piece);
                frame.add(square);
                squares[row][col] = square;
            }
        }
    }

    public void lightUpSquare(Coordinate coordinate) {
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                if (squares[row][col].getPosition().equals(coordinate)) {
                    squares[row][col].lightUp();
                }
            }
        }
    }

    public void updateBoard(Piece[][] board) {
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                Piece piece = board[row][col];
                if (squares[row][col].getPiece() != board[row][col]) {
                    squares[row][col].setPiece(board[row][col]);
                }
            }
        }
    }

    public void setSquareListener(ActionListener squareListener) {
        for (int row = ROWS-1; row >= 0; row--) {
            for (int col = 0; col < COLS; col++) {
                squares[row][col].addActionListener(squareListener);
            }
        }
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(frame, errorMessage);
    }


}
