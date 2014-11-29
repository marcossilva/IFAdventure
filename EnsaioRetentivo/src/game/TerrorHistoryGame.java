package game;

import io.printer.Printer;
import io.printer.ConsolePrinter;
import interpreter.*;
import player.PlayerWithoutHP;

/**
 *
 * @author marcos
 * @time 1:37:06 PM
 */
public class TerrorHistoryGame extends Game{
    public TerrorHistoryGame(Printer p, Interpreter in) {
        super(p, in);
    }
    
    public TerrorHistoryGame() {
        super(new ConsolePrinter(), new InterpreterPT());
        //Inicializar fábrica de comandos
        player = new PlayerWithoutHP();        
    }

    @Override
    protected boolean fimDeJogo(){
        return (room.getNUM_SALA() == 3) && (player.getInventory().search("galao"));
    }
}
