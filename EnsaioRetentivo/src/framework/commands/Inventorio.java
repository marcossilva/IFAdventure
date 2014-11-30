/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.commands;

import framework.game.Game;
import framework.item.Item;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Inventorio extends Command {
    
    Inventorio(String input) {
        this.input = input;
    }
    
    @Override
    public void execute(String command, String input) {
        StringBuilder temp = new StringBuilder();
        String objetoObservado = "";
        try {
            objetoObservado = input.split(" ")[1].toLowerCase();
            Item t = Game.getPlayer().getInventory().searchItem(objetoObservado);
            Game.getPrinterStream().print(t.getName() + "\n\"" + t.getDescription() + "\"");
        } catch (ArrayIndexOutOfBoundsException error) {
            //Não há objeto especificado, listar todo inventorio
            for (Iterator iterator = Game.getPlayer().getInventory().iterator(); iterator.hasNext();) {
                Item i = (Item) iterator.next();
                Game.getPrinterStream().print("\t"+i.getName() + "\n\t\t\"" + i.getDescription() + "\"\n");
            }
        }
    }
    
}
