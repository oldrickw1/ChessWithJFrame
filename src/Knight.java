import java.util.ArrayList;
import java.util.List;

public class Knight extends Piece {
    private static final String imgPathToWhite = "resources/knight_white_small.png";
    private static final String imgPathToBlack = "resources/knight_black_small.png";

    public Knight(boolean isWhite) {
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
