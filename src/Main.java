import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View(model);
        Controller controller = new Controller(model, view);
        controller.run();

        // testing
        model.getPossibleActions(new Coordinate(1, 1));

    }
}
