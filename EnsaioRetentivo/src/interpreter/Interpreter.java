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
    private File json;
    private Scanner in;

    protected Interpreter(String fileDir) {
        //Lê os comandos pré-definidos de um arquivo JSON
        json = new File(fileDir);
        if (!json.exists()) {
            //entrar em modo de debug e inserir comandos do jogo no arquivo
            initializeJSON();
        }
        try {
            in = new Scanner(json);
        } catch (FileNotFoundException ex) {
            //Nunca acontece pois o arquivo é criado com certeza nas linhas acima
        }
        //Ler o arquivo 
        StringBuilder arq = new StringBuilder();
        while (in.hasNextLine()) {
            arq.append(in.nextLine());
            arq.append("\n");
        }
        g = new JSONObject(arq.toString());
        JSONArray commands = g.getJSONArray("command");
    }

    private void initializeJSON() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void interpretar(String comando) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
