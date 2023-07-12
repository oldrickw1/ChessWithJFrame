import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
    private Piece piece;
    private Coordinate position;
    private Boolean isLit;

    public Square(Coordinate position) {
        this.position = position;
        this.isLit = false;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
        if (piece != null) {
            setIcon(new ImageIcon(piece.getImgPath()));
        }
    }

    public void removePiece() {
        this.piece = null;
        setIcon(null);
    }

    public Boolean isLit() {
        return isLit;
    }

    public Boolean hasPiece() {
        return (piece != null);
    }

    public void lightUp() {
        setBackground(Color.WHITE);
        isLit = false;
    }

    public Piece getPiece() {
        return piece;
    }
}
