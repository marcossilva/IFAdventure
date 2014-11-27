package printer;

import java.io.PrintStream;

/**
 *
 * @author marcos
 * @time 1:30:55 PM
 */
public class ConsolePrinter implements Printer{
    private PrintStream s = System.out;

    @Override
    public void print(String message) {
        s.println(message);
    }    
}
