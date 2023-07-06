import java.util.List;

public abstract class Piece {
    private int id;
    private List<Coordinate> allPossibleSteps;
    private boolean isWhite;
    private Coordinate position;

    public Piece(int id, boolean isWhite, Coordinate position) {
        this.id = id;
        this.isWhite = isWhite;
        this.position = position;
    }

    public abstract void takeStep();

//    public List<HashMap<Integer, Integer>> getPossibleSteps(Model board) {
//        return possibleSteps;
//    }



    public boolean isWhite() {
        return isWhite;
    }
}
