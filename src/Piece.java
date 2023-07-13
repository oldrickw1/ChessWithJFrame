import java.util.ArrayList;
import java.util.List;

public abstract class Piece {
    private boolean isAlive;
    private boolean isWhite;

    public Piece(boolean isWhite) {
        isAlive = true;
        this.isWhite = isWhite;
    }

    public abstract ArrayList<List<Coordinate>> getAllTrajectories();

    public abstract String getImgPath();

    public boolean isWhite() {
        return isWhite;
    }



    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
