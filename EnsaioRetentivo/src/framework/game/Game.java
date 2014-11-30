package framework.game;

import framework.interpreter.Interpreter;
import framework.interpreter.InterpreterFactory;
import framework.io.input.Input;
import framework.player.Player;
import framework.io.printer.Printer;
import framework.player.PlayerWithHP;
import framework.world.WorldPiece;

/**
 *
 * @author marcos
 * @time 1:29:00 PM
 */
public abstract class Game {

    private static Printer p;
    private final Interpreter interpret;
    protected Player player;
    protected WorldPiece room;
    private WorldPiece previousRoom;
    private static Input in;
    JSONFactory t;
    protected Game(Printer print, String lang, Input input, JSONFactory myFac) {
        t = myFac;
        p = print;
        in = input;
        this.interpret = InterpreterFactory.getInterpreter(lang, this);
        player = new PlayerWithHP(20);
        room = new WorldPiece(0);
    }

    public void start() {
        //TODO: menu de jogo
        while (fimDeJogo()) { //hook
            if (mudouDeSala()) {
                p.print(room.getDESCRIPTION());
            }
            interpret.interpretar();
        }
    }

    protected boolean fimDeJogo() {
        return false;
    }

    private boolean mudouDeSala() {
        if (previousRoom != room) {
            previousRoom = room;

            return true;
        }
        return false;

    }

    public static Input getInputStream() {
        return in;
    }

    public static Printer getPrinterStream() {
        return p;
    }
}
