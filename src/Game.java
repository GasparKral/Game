import controllers.GameController;
import utils.Utils;

public class Game {

    private static Game instance = null;
    private String roomID = Utils.idGenetarator();
    private GameController gameController = new GameController();

    private Game() {
        
    }

    public static Game getInstance() {
        if (instance == null) {
            instance = new Game();
        }
        return instance;
    }
}
