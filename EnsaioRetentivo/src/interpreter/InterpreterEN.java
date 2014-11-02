/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

/**
 *
 * @author Marcos
 */
class InterpreterEN extends Interpreter {

    public InterpreterEN() {
        super("commands_en.json", "Command not recognized. Did you mean ");        
    }

    @Override
    protected void initializeJSON() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
