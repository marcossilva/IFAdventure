/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.io.input;

import java.io.InputStream;

/**
 *
 * @author Marcos
 */
public class ConsoleInput extends Input{

    public ConsoleInput() {
        super(System.in);
    }
    
}
