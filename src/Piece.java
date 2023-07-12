import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private Coordinate coordinate;
    private boolean isWhite;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract ArrayList<List<Coordinate>> getAllTrajectories(Coordinate position);

    public abstract String getImgPath();

    public boolean isWhite() {
        return isWhite;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public void setCoordinate(Coordinate coordinate) {
        this.coordinate = coordinate;
    }
}
