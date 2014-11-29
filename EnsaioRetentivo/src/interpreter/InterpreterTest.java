/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interpreter;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author Marcos
 */
public class InterpreterTest {
    public static void main(String[] args) {
        InterpreterFactory factory = new InterpreterFactory();
        Interpreter interpreter = factory.getInterpreter("br");
        interpreter.interpretar("obswrvqr");
    }
}
