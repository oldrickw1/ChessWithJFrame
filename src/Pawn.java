import java.util.ArrayList;
import java.util.List;

public class Pawn extends Piece {
    public Pawn(boolean isWhite) {
        super(isWhite);
    }

    @Override
    public List<Coordinate> getAllSteps() {
        return new ArrayList<>(List.of(
                new Coordinate(getRow() + 1, getColumn()),
                new Coordinate(getRow() + 2, getColumn())
        ));
    }


}
