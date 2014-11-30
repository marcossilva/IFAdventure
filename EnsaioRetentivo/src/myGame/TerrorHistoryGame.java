package myGame;

import framework.game.Game;
import framework.io.input.Input;
import framework.io.printer.Printer;


/**
 *
 * @author marcos
 * @time 1:37:06 PM
 */
public class TerrorHistoryGame extends Game {

    public TerrorHistoryGame(Printer p, String lang, Input i) {
        super(p, lang, i);
        
    }


    @Override
    protected boolean fimDeJogo() {
        return (room.getNUM_SALA() == 3) && (player.getInventory().search("galao"));
    }
}
