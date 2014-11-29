/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.input;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author Marcos
 */
public abstract class Input {
    private Scanner in;
    public Input(InputStream stream) {
        in = new Scanner(stream);
    }
    public String getInput(){
        return this.in.nextLine();
    }
    
}
