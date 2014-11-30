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
    private final Printer p;
    private final Interpreter interpret;
    Player player;
    WorldPiece room;

    Game(Printer p, String lang, Input in) {
        this.p = p;
        this.interpret = InterpreterFactory.getInterpreter(lang, in);
        player = new PlayerWithHP(20);
        room = new WorldPiece(0);
    }

    public void start() {
        //TODO: menu de jogo
        while (fimDeJogo()) { //hook
            if (mudouDeSala) p.print(room.getDESCRIPTION());
            interpret.interpretar();
        }        
    }

    protected boolean fimDeJogo() {
        return false;
    }
}
