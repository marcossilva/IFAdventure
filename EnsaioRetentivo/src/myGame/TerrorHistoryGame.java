package myGame;

import framework.game.Game;
import framework.game.JSONFactory;
import framework.io.input.ConsoleInput;
import framework.io.input.Input;
import framework.io.printer.ConsolePrinter;
import framework.io.printer.Printer;


/**
 *
 * @author marcos
 * @time 1:37:06 PM
 */
public class TerrorHistoryGame extends Game {

    public TerrorHistoryGame(Printer p, String lang, Input i, JSONFactory fac) {
        super(p, lang, i, fac);        
    }

    @Override
    protected boolean fimDeJogo() {
        return (room.getNUM_SALA() == 3) && (player.getInventory().search("galao"));
    }
    public static void main(String[] args) {
        Game g = new TerrorHistoryGame(new ConsolePrinter(), "pt" , new ConsoleInput(), new TerrorHistoryJSONFactory());
        g.start();
    }
}
