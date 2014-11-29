package game;

import factory.TerrorHistoryJSONFactory;
import interpreter.*;
import player.PlayerWithoutHP;
import printer.*;

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
    public void start() {        
    }
}
