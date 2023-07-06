import java.util.List;

public abstract class Piece {
    private boolean isWhite; // use Color.enum ?
    private int row;
    private int column;

    public Piece(boolean isWhite) {
        this.isWhite = isWhite;
    }

    public abstract List<Coordinate> getAllSteps();

//    public List<HashMap<Integer, Integer>> getPossibleSteps(Model board) {
//        return possibleSteps;
//    }



    public boolean isWhite() {
        return isWhite;
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }
}
