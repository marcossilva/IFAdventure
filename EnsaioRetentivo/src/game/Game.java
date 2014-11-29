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

    private final Printer p;
    private final Interpreter interpret;
    private final Input in;
    Player player;
    WorldPiece room;

    Game(Printer p, Interpreter interpreter, Input in) {
        this.p = p;
        this.interpret = interpreter;
        this.in = in;
        player = new PlayerWithHP(20);
        room = new WorldPiece(0);
    }

    public void start() {
        //TODO: menu de jogo
        while (fimDeJogo()) { //hook
            p.print(room.getDESCRIPTION());
            interpret.interpretar(in.getInput());
        }        
    }

    protected boolean fimDeJogo() {
        return false;
    }
}
