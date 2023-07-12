import java.util.ArrayList;
import java.util.List;

public class Bishop extends Piece {
    private static final String imgPathToWhite = "resources/bishop_white_small.png";
    private static final String imgPathToBlack = "resources/bishop_black_small.png";

    public Bishop(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public ArrayList<List<Coordinate>> getAllTrajectories(Coordinate position) {
        return null;
    }

    @Override
    public String getImgPath() {
        return isWhite() ? imgPathToWhite : imgPathToBlack;
    }


}
