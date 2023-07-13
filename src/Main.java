public class Main {
    // ---  v2  ---
    public static void main(String[] args) {
        ChessModel chessModel = new ChessModel();
        ChessView chessView = new ChessView();
        ChessController controller = new ChessController(chessModel, chessView);
        controller.run();

        // testing
//        model.getPossibleActions(new Coordinate(1, 1));

    }
}
