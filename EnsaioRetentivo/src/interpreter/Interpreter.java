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
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
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
    JSONObject g;
    File json;
    private File dir = new File(System.getProperty("user.dir") + "\\game\\commands\\");
    private Scanner in;
    /**
     * * @TODO melhor maneira de deixar mensagem de erro genérica?
     */
    private String errorMsg;

    protected Interpreter(String fileDir, String errorMsg) {
        this.errorMsg = errorMsg;
        //Lê os comandos pré-definidos de um arquivo JSON
        json = new File(dir, fileDir);
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
                in.close();
                //pq colocar um JSONObject se o arquivo de comandos é certamente um único array?
                g = new JSONObject(arq.toString());
            } catch (FileNotFoundException ex) {
                //Nunca acontece pois o arquivo é criado com certeza nas linhas acima
                System.out.println("Arquivo não encontrado :(");
            }
        }
    }

    protected abstract void initializeJSON();

    @Override
    public String interpretar(String comando) {
        String comand = comando.split(" ")[0];
        String closestCommand = null;
        int hashInput = comand.hashCode();
        int hashRead = 0;
        int closestHashRead = Integer.MAX_VALUE;
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
