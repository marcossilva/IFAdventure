package framework.commands;

import framework.game.Game;
import framework.game.JSONFactory;
import framework.org.json.JSONObject;


/**
 *
 * @author marcos
 * @time 2:45:42 PM
 */
public class Ajuda extends Command {

    Ajuda(String input) {
        this.input = input;
    }


    @Override
    public void execute(String command, String input){
        JSONObject commands = JSONFactory.getCommands();
        Game.getPrinterStream().print("Os comandos disponíveis são:");
        for(String com : commands.keySet()){
            Game.getPrinterStream().print(com);
        }
    }

}
