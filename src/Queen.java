import java.util.ArrayList;
import java.util.List;

public class Queen extends Piece{
    private static final String imgPathToWhite = "resources/queen_white_small.png";
    private static final String imgPathToBlack = "resources/queen_black_small.png";
    public Queen(boolean isWhite) {
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
