/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.commands;

/**
 *
 * @author Paulo
 */
public class CommandFactory {

    public CommandFactory() {
    }

    public static Command getCommand(String comando) {
        if (comando.equals("ajuda")) {
            return new Ajuda();
        } else if (comando.equals("observar")) {
            return new Observar();
        } else if (comando.equals("inventorio")) {
            return new Inventorio();
        } else if (comando.equals("movimento")){
            return new Mover();
        
        }
        
        throw new Error("Erro na entrada do comando");

    }

}
