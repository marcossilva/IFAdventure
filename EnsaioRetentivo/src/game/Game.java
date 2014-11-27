package game;


import interpreter.Interpreter;
import printer.Printer;

/**
 *
 * @author marcos
 * @time 1:29:00 PM
 */
public abstract class Game {
    private Printer p;
    private Interpreter in;
    Game (Printer p, Interpreter in){
        this.p = p;
        this.in = in;
    }
    public abstract void start();
}
