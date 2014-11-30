package framework.io.printer;

import java.io.PrintStream;

/**
 *
 * @author marcos
 * @time 1:30:55 PM
 */
public class ConsolePrinter implements Printer{
    private PrintStream s = System.out;
//System.out.println((char)27 +"[41m testing bold");
//http://stackoverflow.com/questions/5062458/font-settings-for-strings-in-java
    @Override
    public void print(String message) {
        s.println(message);
    }    
}
