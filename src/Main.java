public class Main {
    public static void main(String[] args) {
        ChessModel chessModel = new ChessModel();
        ChessView chessView = new ChessView(chessModel.getBoard());
        ChessController controller = new ChessController(chessModel, chessView);
        controller.run();

        // testing
//        model.getPossibleActions(new Coordinate(1, 1));

    }
}
