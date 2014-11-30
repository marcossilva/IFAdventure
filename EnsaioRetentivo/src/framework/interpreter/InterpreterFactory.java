/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.interpreter;

import framework.io.input.Input;

/**
 *
 * @author Marcos
 */
public class InterpreterFactory {
    //Interpreters não serão diretamente instanciados pelo código. 
    /** @TODO Faz sentido o Factory ser estático?*/
    /**
     * @param idioma
     * @param in
     * @return  *  @TODO Exception joga string na exceção.*/
    public static Interpreter getInterpreter(String idioma, Input in) {
        if (idioma.toLowerCase().startsWith("pt") || idioma.toLowerCase().startsWith("br")) {
            return new InterpreterPT(in);
        }
        if (idioma.toLowerCase().startsWith("en")) {
            return new InterpreterEN(in);
        }
        throw new ExceptionInInitializerError("Problem with specified factory. Please check.");
    }
}
