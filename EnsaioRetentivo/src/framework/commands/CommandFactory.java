/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.commands;

import framework.game.JSONFactory;

/**
 *
 * @author Paulo
 */
public class CommandFactory {

    public static Command getCommand(String comando, String input) {
        switch (JSONFactory.getCommands().getString(comando)) {
            case "ajuda":
                return new Ajuda(input);
            case "observar":
                return new Observar(input);
            case "inventorio":
                return new Inventorio(input);
            case "movimento":
                return new Mover(input);        
        }
        throw new Error("Erro na entrada do comando");
    }
}
