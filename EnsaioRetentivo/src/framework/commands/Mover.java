/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.commands;

import framework.game.Game;
import framework.world.WorldPiece;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Mover extends Command {

    Mover(String input) {
        this.input = input;
    }

    @Override
    public void execute(String command, String input) {
        int d = 0;
        String direcao = "";
        try {
            direcao = input.split(" ")[1].toLowerCase();
        } catch (ArrayIndexOutOfBoundsException error) {
            Game.getPrinterStream().print("Direção não detectada.");
        }
        switch (direcao) {
            case ("n"):
                d = 0;
                break;
            case ("norte"):
                d = 0;
                break;
            case ("s"):
                d = 1;
                break;
            case ("sul"):
                d = 1;
                break;
            case ("leste"):
                d = 2;
                break;
            case ("l"):
                d = 2;
                break;
            case ("oeste"):
                d = 3;
                break;
            case ("o"):
                d = 3;
                break;
            default: {
                try {
                    throw new Exception("Unusual Error");
                } catch (Exception ex) {
                    Logger.getLogger(Mover.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        int nextRoom = Game.getRoom().getWAYS()[d];
        if (nextRoom >= 0) {
            Game.setRoom(new WorldPiece(nextRoom));
        } else {
            Game.getPrinterStream().print("Direção impossível");
        }
    }

}
