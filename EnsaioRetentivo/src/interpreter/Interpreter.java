/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Marcos
 */
public abstract class Interpreter implements Interprete {

    private static Interprete interpreter;
    private JSONObject g;
    private JSONArray commands;
    private File json;
    private Scanner in;
    /**     * @TODO melhor maneira de deixar mensagem de erro genérica?     */
    private String errorMsg;

    protected Interpreter(String fileDir, String errorMsg) {
        this.errorMsg = errorMsg;
        //Lê os comandos pré-definidos de um arquivo JSON
        json = new File(fileDir);
        if (!json.exists()) {
            //entrar em modo de debug e inserir comandos do jogo no arquivo
            initializeJSON();
        } else {
            try {
                in = new Scanner(json);
                //Ler o arquivo 
                StringBuilder arq = new StringBuilder();
                while (in.hasNextLine()) {
                    arq.append(in.nextLine());
                    arq.append("\n");
                }
                g = new JSONObject(arq.toString());
                commands = g.getJSONArray("command");
            } catch (FileNotFoundException ex) {
                //Nunca acontece pois o arquivo é criado com certeza nas linhas acima
            }
        }
    }

    private void initializeJSON() {
        //DEBUG MODE
        //Acessível apenas para programadores inserirem comandos no jogo.
        
    }

    @Override
    public String interpretar(String comando) {
        double hashInput = comando.hashCode();
        double hashRead = 0;
        double closestHashRead = 0;
        
        int commandIndex = 0;
        
        String retorno = "";
        for (int i = 0; i < commands.length(); i++) {
            hashRead = commands.get(i).toString().hashCode();
            if (hashRead == hashInput){
                //execute this command
                commandIndex = -1;
                break;
            }
            //Procura o comando mais próximo ao digitado pelo usuário pelo hash do String digitado
            if (Math.min(closestHashRead, Math.abs(hashRead - hashInput)) != closestHashRead){
                commandIndex = i;
                closestHashRead = Math.min(closestHashRead, Math.abs(hashRead - hashInput));
            }
        }
        if (commandIndex >= 0){
            //Comando não executado
            /**
             * @TODO Adicionar respostas inusitadas
             */
            retorno = errorMsg + commands.get(commandIndex).toString() + "?";
        }
        return null;
    }

}
