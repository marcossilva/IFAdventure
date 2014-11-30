/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.interpreter;

import framework.io.input.Input;
import framework.org.json.JSONObject;
import myGame.JSONFactory;

/**
 *
 * @author Marcos
 */
public abstract class Interpreter{
    private final Input in;
    public Interpreter(Input in) {
        this.in = in;
    }        
    public String interpretar() {
        String comando = in.getInput();
        String comand = comando.split(" ")[0];
        String closestCommand = null;
        int hashInput = comand.hashCode();
        int hashRead = 0;
        int closestHashRead = Integer.MAX_VALUE;
        JSONObject comandos = JSONFactory.getCommands();
        for (String key : g.keySet()) {
            hashRead = key.hashCode();
            /*System.out.println("Comando lido = " + comand);
             System.out.println("Hash desse comando = " + hashInput);
             System.out.println("Comando reconhecido = " + key);
             System.out.println("Hash desse comando = " + hashRead);*/
            if (hashRead == hashInput) {
                //sai do loop                
                closestHashRead = 0;
                break;
            }
            //Procura o comando mais próximo ao digitado pelo usuário pelo hash do String digitado
            if (Math.min(closestHashRead, Math.abs(hashRead - hashInput)) != closestHashRead) {
                closestHashRead = Math.min(closestHashRead, Math.abs(hashRead - hashInput));
                closestCommand = key;
            }
        }
        if (closestHashRead == 0) { //O comando achado é o comando digitado
            System.out.println("O comando digitado foi " + comand + " e é do tipo " + g.get(comand));
        } else {
            //Comando não executado
            /**
             * @todo Adicionar respostas inusitadas
             */
            /*System.out.println(errorMsg + closestCommand + "?");*/
            System.out.println("O comando digitado foi " + comand + " e não foi reconhecido. Você quis dizer " + closestCommand + "?");
        }
        return null;
    }
}
