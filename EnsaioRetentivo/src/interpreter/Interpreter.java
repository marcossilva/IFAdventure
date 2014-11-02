/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    /**
     * * @TODO melhor maneira de deixar mensagem de erro genérica?
     */
    private String errorMsg;

    protected Interpreter(String fileDir, String errorMsg) {
        this.errorMsg = errorMsg;
        //Lê os comandos pré-definidos de um arquivo JSON
        json = new File(System.getProperty("user.dir") + fileDir);
        if (!json.exists()) {
            //entrar em modo de debug e inserir comandos do jogo no arquivo
            initializeJSON();
        } else {
            try {
                System.out.println("Arquivo de comandos encontrado! Lendo entradas!");
                in = new Scanner(json);
                //Ler o arquivo 
                StringBuilder arq = new StringBuilder();
                while (in.hasNextLine()) {
                    arq.append(in.nextLine());
                    arq.append("\n");
                }
                //pq colocar um JSONObject se o arquivo de comandos é certamente um único array?
                g = new JSONObject(arq.toString());
                commands = g.getJSONArray("commands");
            } catch (FileNotFoundException ex) {
                //Nunca acontece pois o arquivo é criado com certeza nas linhas acima
                System.out.println("Arquivo não encontrado :(");
            }
        }
    }

    private void initializeJSON() {
        //DEBUG MODE
        //Acessível apenas para programadores inserirem comandos no jogo.
        System.out.println("Entrar no modo debug!");
        try {
            json.createNewFile();
            g = new JSONObject();
            commands = new JSONArray();
            commands.put(new JSONObject().put("ver", "observar"));
            commands.put(new JSONObject().put("observar", "observar"));
            commands.put(new JSONObject().put("descrever", "observar"));
            commands.put(new JSONObject().put("analisar", "observar"));
            commands.put(new JSONObject().put("subir", "movimento"));
            commands.put(new JSONObject().put("descer", "movimento"));
            commands.put(new JSONObject().put("ir", "movimento"));
            commands.put(new JSONObject().put("andar", "movimento"));
            commands.put(new JSONObject().put("inventorio", "inventorio"));
            commands.put(new JSONObject().put("inventório", "inventorio"));
            commands.put(new JSONObject().put("usar", "inventorio"));
            commands.put(new JSONObject().put("descartar", "inventorio"));
            g.put("commands", commands);
            FileWriter writer = new FileWriter(json);
            writer.write(g.toString());
            System.out.println(g.toString());
        } catch (IOException ex) {
            System.err.println("Can't write to directory.");
        }
    }

    @Override
    public String interpretar(String comando) {
        if (commands == null) {
            try {
                throw new Exception("Inicialize o arquivo de comandos pfvr, obg.");
            } catch (Exception ex) {
                Logger.getLogger(Interpreter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        double hashInput = comando.hashCode();
        double hashRead = 0;
        double closestHashRead = 0;

        int commandIndex = 0;

        String retorno = "";
        for (int i = 0; i < commands.length(); i++) {
            hashRead = commands.get(i).toString().hashCode();
            commandIndex = i;
            if (hashRead == hashInput) {
                //sai do loop
                break;
            }
            //Procura o comando mais próximo ao digitado pelo usuário pelo hash do String digitado
            if (Math.min(closestHashRead, Math.abs(hashRead - hashInput)) != closestHashRead) {
                closestHashRead = Math.min(closestHashRead, Math.abs(hashRead - hashInput));
            }
        }
        if (closestHashRead == 0) { //O comando achado é o comando digitado
            System.out.println("O comando digitado foi " + commands.get(commandIndex).toString());
        }
        if (commandIndex < 0) {
            //Comando não executado
            /**
             * @TODO Adicionar respostas inusitadas
             */
            retorno = errorMsg + commands.get(commandIndex).toString() + "?";
        }
        return null;
    }

}
