package game;

import interpreter.Interpreter;
import io.input.Input;
import player.Player;
import io.printer.Printer;
import player.PlayerWithHP;
import world.WorldPiece;

/**
 *
 * @author marcos
 * @time 1:29:00 PM
 */
public abstract class Game {

    private Printer p;
    private Interpreter interpret;
    private Input in;
    Player player;
    WorldPiece room;
    private boolean endGame = false;

    Game(Printer p, Interpreter in) {
        this.p = p;
        this.interpret = in;
        player = new PlayerWithHP(20);
        room = new WorldPiece(0);
    }

    public void start() {
        while (fimDeJogo()) { //hook
            p.print(room.getDESCRIPTION());
            interpret.interpretar(in.getInput());
        }
    }

    protected boolean fimDeJogo() {
        return false;
    }
}
