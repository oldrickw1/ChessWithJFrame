import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    private static final String imgPathToWhite = "resources/pawn_white_small.png";
    private static final String imgPathToBlack = "resources/pawn_black_small.png";
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<List<Coordinate>> getAllTrajectories(Coordinate position) {
        return new ArrayList<>(List.of(
                new ArrayList<>(List.of(
                        new Coordinate(position.getRow() + 1, position.getColumn()),
                        new Coordinate(position.getRow() + 2, position.getColumn())
                ))
        ));
    }

    public String getImgPath() {
        return isWhite() ? imgPathToWhite : imgPathToBlack;
    }
}
