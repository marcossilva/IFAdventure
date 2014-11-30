/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.commands;

import framework.game.Game;
import framework.item.Item;
import java.util.List;

/**
 *
 * @author Marcos
 */
public class Observar extends Command {

    Observar(String input) {
        this.input = input;
    }

    @Override
    public void execute(String command, String input) {
        String objetoObservado = "";
        try {
            objetoObservado = input.split(" ")[1].toLowerCase();
            List<Item> itens = Game.getRoom().getITENS();
            boolean objetoEncontrado = false;
            for (Item item : itens) {
                if (item.getName().equals(objetoObservado)) {
                    //Observar um item coloca ele automaticamente no inventorio
                    Game.getPrinterStream().print(item.getDescription());
                    if (Game.getPlayer().getInventory().getCapacity() > item.getWeight()) {                        
                        Game.getPlayer().getInventory().add(item);
                        Game.getPrinterStream().print("Item adicionado ao inventário");
                    }
                    objetoEncontrado = true;
                    break;
                }
            }
            if (!objetoEncontrado) {
                Game.getPrinterStream().print("Objeto digitado não está na sala");
            }
        } catch (ArrayIndexOutOfBoundsException error) {
            //Não há nada a se especificar, então imprime descricao da sala
            Game.getPrinterStream().print(Game.getRoom().getDESCRIPTION());
        }
    }

}
