package game;

import io.printer.Printer;
import io.printer.ConsolePrinter;
import interpreter.*;
import io.input.ConsoleInput;
import io.input.Input;
import player.PlayerWithHP;
import player.PlayerWithoutHP;
import world.WorldPiece;

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
