package game;

import factory.JSONFactory;
import interpreter.*;
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
    }

    @Override
    public void start() {        
    }
}
