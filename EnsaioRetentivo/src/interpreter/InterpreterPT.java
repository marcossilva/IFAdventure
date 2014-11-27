/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONObject;

/**
 *
 * @author Marcos
 */
public class InterpreterPT extends Interpreter {
    public InterpreterPT(){
        super("commands_pt.json", "Comando não reconhecido. Você quis dizer ");
    }

    @Override
    protected void initializeJSON() {
        //DEBUG MODE
        //Acessível apenas para programadores inserirem comandos no jogo.
        //Backup em código para o caso de se apagar o arquivo de comandos
        try {
            json.createNewFile();
            g = new JSONObject();            
            g.put("ver", "observar");
            g.put("observar", "observar");
            g.put("descrever", "observar");
            g.put("analisar", "observar");
            g.put("subir", "movimento");
            g.put("descer", "movimento");
            g.put("ir", "movimento");
            g.put("andar", "movimento");
            g.put("inventorio", "inventorio");
            g.put("inventório", "inventorio");
            g.put("usar", "inventorio");
            g.put("descartar", "inventorio");
            FileWriter writer = new FileWriter(json);
            writer.write(g.toString());
            writer.flush();
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(InterpreterPT.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
