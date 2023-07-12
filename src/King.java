import java.util.ArrayList;
import java.util.List;

public class King extends Piece{
    private static final String imgPathToWhite = "resources/king_white_small.png";
    private static final String imgPathToBlack = "resources/king_black_small.png";
    public King(boolean isWhite) {
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
