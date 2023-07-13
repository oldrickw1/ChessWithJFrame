import java.util.ArrayList;
import java.util.List;

public class Rook extends Piece {
    private static final String imgPathToWhite = "resources/rook_white_small.png";
    private static final String imgPathToBlack = "resources/rook_black_small.png";

    public Rook(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<List<Coordinate>> getAllTrajectories() {
        return null;
    }

    @Override
    public String getImgPath() {
        return isWhite() ? imgPathToWhite : imgPathToBlack;
    }



}
