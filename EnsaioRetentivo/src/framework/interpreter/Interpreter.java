/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.interpreter;

import framework.commands.CommandFactory;
import framework.game.Game;
import framework.game.JSONFactory;


/**
 *
 * @author Marcos
 */
public abstract class Interpreter {
    Game g;
    public Interpreter(Game g) {
        this.g = g;
    }

    public String interpretar() {
        //<editor-fold defaultstate="collapsed" desc="Itera sobre todos os comandos e verifica se algum é igual ao digitado ou sugere o comando mais próximo">
        String comando = Game.getInputStream().getInput();
        String comand = comando.split(" ")[0];
        String closestCommand = "";
        int hashInput = comand.hashCode();
        int hashRead = 0;
        int closestHashRead = Integer.MAX_VALUE;
        String comandoEncontrado = "";
        for (String key : JSONFactory.getCommands().keySet()) {
            hashRead = key.hashCode();
            if (hashRead == hashInput) {
                //sai do loop
                closestHashRead = 0;
                comandoEncontrado = key;
                break;
            }
            //Procura o comando mais próximo ao digitado pelo usuário pelo hash do String digitado
            if (Math.min(closestHashRead, Math.abs(hashRead - hashInput)) != closestHashRead) {
                closestHashRead = Math.min(closestHashRead, Math.abs(hashRead - hashInput));
                closestCommand = key;
            }
        }
//</editor-fold>
        if (closestHashRead == 0) { //O comando achado é o comando digitado
            CommandFactory.getCommand(comandoEncontrado, comando);
        } else { //Sugere o comando mais próximo
            Game.getPrinterStream().print("O comando digitado foi " + comand + " e não foi reconhecido. Você quis dizer " + closestCommand + "?");
        }
        return null;
    }
}
