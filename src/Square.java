import javax.swing.*;
import java.awt.*;

public class Square extends JButton {
    private Piece piece;
    private Boolean isLit;
    private Coordinate position;

    public Square(Coordinate coordinate) {
        this.isLit = false;
        position = coordinate;
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
        isLit = true;
    }

    public void dimLight() {
        setBackground(null);
        isLit = false;
    }

    public Coordinate getPosition() {
        return position;
    }

    public void setPosition(Coordinate position) {
        this.position = position;
    }

    public Piece getPiece() {
        return piece;
    }
}
