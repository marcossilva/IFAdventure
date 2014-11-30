package myGame;

import framework.Interpreter;
import framework.game.Game;
import framework.io.printer.Printer;
import framework.io.printer.ConsolePrinter;
import framework.io.input.ConsoleInput;
import framework.io.input.Input;
import framework.player.PlayerWithHP;
import framework.player.PlayerWithoutHP;
import framework.world.WorldPiece;

/**
 *
 * @author marcos
 * @time 1:37:06 PM
 */
public class TerrorHistoryGame extends Game {

    public TerrorHistoryGame(Printer p, Interpreter in, Input i) {
        super(p, in, i);
    }

    public TerrorHistoryGame() {
        super(new ConsolePrinter(), new InterpreterPT(), new ConsoleInput());
    }

    @Override
    protected boolean fimDeJogo() {
        return (room.getNUM_SALA() == 3) && (player.getInventory().search("galao"));
    }
}
